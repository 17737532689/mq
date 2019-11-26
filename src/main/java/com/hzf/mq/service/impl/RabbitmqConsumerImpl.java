package com.hzf.mq.service.impl;

import com.google.gson.Gson;
import com.hzf.mq.entity.DAttachmentRes;
import com.hzf.mq.entity.DDataMinCars;
import com.hzf.mq.entity.DResRealtime;
import com.hzf.mq.enums.ColorEnums;
import com.hzf.mq.enums.Fuel;
import com.hzf.mq.enums.Result;
import com.hzf.mq.service.IRabbitmqConsumer;
import com.hzf.mq.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Configuration
@Component
// 自己添加的，指定配置文件
@PropertySource(value = "classpath:application-log.properties")
@ConfigurationProperties(prefix = "air")
@Slf4j
@Service
public class RabbitmqConsumerImpl  extends  BaseService implements IRabbitmqConsumer {
    @Value("${air.CO}")
    private Double CO;
    @Value("${air.HC}")
    private String HC;
    @Value("${air.N}")
    private String NO;
    @Value("${air.SMOKE}")
    private String SMOKE;
    @RabbitListener(queues = "queue_test_one")
    public Message processQueue13(String data) throws FileNotFoundException {
        //  log.info(String.format("%s %s","消费者分钟："+record.value(),"话题："+record.topic()));
        Message message = new Message();
        Gson gson =new Gson();

        DDataMinCars dataMinCars = gson.fromJson(data, DDataMinCars.class);

        // String path = ResourceUtils.getURL("src/main/resources/static").getPath();
        String path = ResourceUtils.getURL("/home/envsafe/image").getPath();
        if(dataMinCars!=null){
            boolean flag = insertDResRealTime(path, dataMinCars);

            if(flag==false){
                message.setCount(201);
                message.setMsg("error");
                return message;
            }else {
                dataMinCars.setCar_picture(null);
                log.info(String.format("%s %s","消费者分钟："+ dataMinCars));
            }

        }

        message.setCount(200);
        message.setMsg("success");
        return message;
    }

    public DAttachmentRes imgPath(DAttachmentRes dAttachmentRes, String url, String imgStr, DResRealtime dResRealtime) {


        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);// 得到年 int
        int month = cal.get(Calendar.MONTH) + 1;// 得到月，因为从0开始的，所以要加1 int
        int day = cal.get(Calendar.DAY_OF_MONTH);// 得到天 int
        int hour = cal.get(Calendar.HOUR);// 得到小时
        int minute = cal.get(Calendar.MINUTE);// 得到分钟
        int second = cal.get(Calendar.SECOND);// 得到秒 int num=
        int num = (int) ((Math.random() * 9 + 1) * 100000);// 生成六位随机数

        String time = String.valueOf(year) + String.valueOf(month) + String.valueOf(day) + String.valueOf(hour)
                + String.valueOf(minute) + String.valueOf(second) + num;
        //名称
        String name=  dResRealtime.getTS_NO() + "_" + time;
        //照片存放路径
        String imgFilePath = url + "/" + String.valueOf(year) + "/" + String.valueOf(month) + "/"
                + String.valueOf(day) + "/" + dResRealtime.getTS_NO() + "/" +  dResRealtime.getTS_NO() + "_"
                + time + ".jpg";
        //文件夹路径
        String dir = url + "/" + String.valueOf(year) + "/" + String.valueOf(month) + "/" + String.valueOf(day)
                + "/" + dResRealtime.getTS_NO();
        File dirPath = new File(dir);
        File file = new File(imgFilePath);
        if (!file.exists()) {

            if (!dirPath.exists()) {
                //生成多级文件夹
                dirPath.mkdirs();
            }
            // 前台在用Ajax传base64值的时候会把base64中的+换成空格，所以需要替换回来。
            String addImgStr = imgStr.replaceAll(" ", "+");
            String replaceImgStr = addImgStr.replace("data:image/jpeg;base64,", "");
            replaceImgStr = replaceImgStr.replace("data:image/png;base64,", "");
            // Base64解码
            boolean base64ToImage = ImageBase64Util.Base64ToImage(replaceImgStr, imgFilePath);
            if (base64ToImage ==true) {

                String filePath =  "/" + String.valueOf(year) + "/" + String.valueOf(month) + "/"
                        + String.valueOf(day) + "/" +dResRealtime.getTS_NO() + "/" + dResRealtime.getTS_NO()
                        + "_" + time + ".jpg";
                //扩展名
                dAttachmentRes.setNAME(name);
                dAttachmentRes.setTYPE(1);
                dAttachmentRes.setEXTENSION(".jpg");
                dAttachmentRes.setFILE_PATH(filePath);
            } else {
                return null;
            }
        }

        return dAttachmentRes;

    }


    public boolean insertDResRealTime(String url,DDataMinCars d){
        //获取站id
        String station_id = d.getStation_id();
        //数据编码
        String data_code = d.getData_code();
        //检测时间
        String test_time = d.getTest_time();
        //车牌号
        String plate_umber = d.getPlate_umber();
        //车牌颜色
        String plate_color = d.getPlate_color();
        //速度
        Float car_speed = d.getCar_speed();
        //加速度
        Float car_accel = d.getCar_accel();
        //VSP
        Float car_vsp = d.getCar_vsp();
        //NO浓度
        Float no_data = d.getNo_data();
        //CO2浓度
        Float co2_data = d.getCo2_data();
        //CO浓度
        Float co_data = d.getCo_data();
        //
        Float hc_data = d.getHc_data();
        //不透光烟度
        Float pm_data = d.getPm_data();
        //风速
        Float wind_speed = d.getWind_speed();
        //风向
        Float wind_direction = d.getWind_direction();
        //温度
        Float temp = d.getTemp();
        //湿度
        Float hum = d.getHum();
        //气压
        Float pressure = d.getPressure();
        //base64图片
        String car_picture = d.getCar_picture();
        //测试站点
        String test_address = d.getTest_address();
        //车道号
        String road_way = d.getRoad_way();
        //检测结果
        String test_result = d.getTest_result();
        //是否黑烟车
        String is_black = d.getIs_black();
        //汽油，柴油
        String car_type = d.getCar_type();
        /*  赋值*/
        DResRealtime dResRealtime = new DResRealtime();
        //监测时间,字符串转日期
        if(CommonUtil.notBankNll(test_time)){
            dResRealtime.setMONITOR_TIME(DateUtil.stringTodate(test_time));
        }
        //车牌号码
        if(CommonUtil.notBankNll(plate_umber)){
            dResRealtime.setLICENSE(plate_umber);
        }
        //车牌颜色
        if(CommonUtil.notBankNll(plate_color)){
            ColorEnums description = ColorEnums.getDescription(plate_color);
            if(description!=null){
                dResRealtime.setLICENSE_TYPE( String.valueOf(description.getId()));
            }else {
                dResRealtime.setLICENSE_TYPE(plate_color);
            }

        }
        //速度
        if(CommonUtil.nullBank(car_speed)){
            dResRealtime.setCS(String.valueOf(car_speed));
        }

        //加速度
        if(CommonUtil.nullBank(car_accel)){
            dResRealtime.setJSD(String.valueOf(car_accel));
        }
        if(CommonUtil.nullBank(car_accel)){
            dResRealtime.setVSP(BigDecimal.valueOf(car_vsp));
        }
        //判断和设定值
        if(CommonUtil.nullBank(no_data)){
            dResRealtime.setNO(String.valueOf(no_data));
            dResRealtime.setNO_LIMIT(NO);
            //是否合格
            boolean flag = AlgorithmUtil.compare(Double.valueOf(no_data),Double.valueOf(NO));
            if(!flag){
                dResRealtime.setNO_JUDG(String.valueOf(Result.getDescription("Y").getId()));
            }else {
                dResRealtime.setNO_JUDG(String.valueOf(Result.getDescription("N").getId()));
            }
        }
        //CO2
        if(CommonUtil.nullBank(co2_data)){
            dResRealtime.setCO2(String.valueOf(co2_data));
            //CO_CO2比率
            String coValue = AlgorithmUtil.divisionFoat(co_data, co2_data);
            BigDecimal bigDecimalValue = new BigDecimal(coValue);
            dResRealtime.setCO_CO2(bigDecimalValue);
            //HC_CO2比率
            String hcValue = AlgorithmUtil.divisionFoat(hc_data, co2_data);
            BigDecimal bigDecimalHC = new BigDecimal(hcValue);
            dResRealtime.setHC_CO2(bigDecimalHC);
            //NO_CO2比率
            String noValue = AlgorithmUtil.divisionFoat(no_data, co2_data);
            BigDecimal bigDecimalNO = new BigDecimal( noValue);
            dResRealtime.setNO_CO2( bigDecimalNO);
        }
        //CO判断和设定值
        if(CommonUtil.nullBank(co_data)){
            dResRealtime.setCO(Double.valueOf(co_data));

            //限制
            dResRealtime.setCO_LIMIT(String.valueOf(CO));

            //是否合格
            boolean flag = AlgorithmUtil.compare(Double.valueOf(co_data), CO);
            if(!flag){
                dResRealtime.setCO_JUDG(Result.getDescription("Y").getId());
            }else {
                dResRealtime.setCO_JUDG(Result.getDescription("N").getId());
            }
        }
        //HC判断和设定
        if(CommonUtil.notBankNll(String.valueOf(hc_data ))){
            dResRealtime.setHC(String.valueOf(hc_data));
            dResRealtime.setHC_LIMIT(HC);
            //是否合格
            boolean flag = AlgorithmUtil.compare(Double.valueOf(hc_data), Double.valueOf(HC));
            if(!flag){
                dResRealtime.setHC_JUDG(Result.getDescription("Y").getId());
            }else {
                dResRealtime.setHC_JUDG(Result.getDescription("N").getId());
            }
        }

        //不透光烟度测量值(%)
        if(CommonUtil.notBankNll(String.valueOf(pm_data))){
            dResRealtime.setSMOKE(String.valueOf(pm_data));
            dResRealtime.setSMOKE_LIMIT(SMOKE);
            //是否合格
            boolean flag = AlgorithmUtil.compare(Double.valueOf(pm_data),Double.valueOf(SMOKE));
            if(!flag){
                dResRealtime.setSMOKE_JUDG(Result.getDescription("Y").getId());
            }else {
                dResRealtime.setSMOKE_JUDG(Result.getDescription("N").getId());
            }
        }

        if(CommonUtil.notBankNll(String.valueOf(wind_speed ))){
            dResRealtime.setWIND_SPEED(String.valueOf(wind_speed ));
        }

        //风向
        if(wind_direction!=null){
            dResRealtime.setWIND_DIRECTION(wind_direction);
        }
        //环境温度
        if(CommonUtil.nullBank(temp)){
            dResRealtime.setTEMPERATURE( String.valueOf(temp));
        }

        //湿度(%)
        if(CommonUtil.nullBank(hum)){
            dResRealtime.setHUMIDITY(String.valueOf(hum));
        }

        //大气压(kpa)
        if(CommonUtil.nullBank(pressure)){
            dResRealtime.setATMOSPHERE(String.valueOf(pressure));
        }

        //车道号
        if(CommonUtil.notBankNll(road_way)){
            dResRealtime.setLANE(road_way);
        }

        //检测结果
        if(CommonUtil.notBankNll(test_result)){
            dResRealtime.setRESULT(Result.getDescription(test_result).getId());
        }

        //汽油、柴油
        if(CommonUtil.notBankNll(car_type)){
            dResRealtime.setFUEL_TYPE(Fuel.getDescription(car_type).getId());
        }

        //监测站编号
        if(CommonUtil.notBankNll(station_id)){
            dResRealtime.setTS_NO(station_id);
        }
        Date date = new Date();
        dResRealtime.setCREATED_TIME(date);
        int count = 0;
        try {
            count = this.getDaoFactory().getdResRealtimeMapper().insertSelective(dResRealtime);
            if(count>0){
                boolean flag = insertDAttachmentRes(url, d,dResRealtime);
                if(flag==false){
                    return false;
                }
                return true;
            }else {
                return false;
            }
        } catch (DuplicateKeyException e) {
            return false;
        }

    }


    public boolean insertDAttachmentRes(String url,DDataMinCars  d,DResRealtime dResRealtime){
        // 设置图片上传路径
        //String url = request.getSession().getServletContext().getRealPath("/picture");
        //base64图片
        String car_picture = d.getCar_picture();

        //获取站实时数据id
        Integer id = dResRealtime.getID();
        DAttachmentRes dAttachmentRes = new DAttachmentRes();
        //站id
        if(id!=null){
            dAttachmentRes.setRES_ID(id);
        }
        //插入信息
        if(CommonUtil.nullBank(car_picture)){
            dAttachmentRes = imgPath(dAttachmentRes, url, car_picture,dResRealtime);
        }

        if(dAttachmentRes!=null){
            //获取时间
            Date date = new Date();
            dAttachmentRes.setCREATED_TIME(date);
            dAttachmentRes.setUPDATED_TIME(date);
            int count = this.getDaoFactory().getdAttachmentResMapper().insertSelective( dAttachmentRes);
            if(count>0){
                return true;
            }else {
                return  false;
            }
        }else {
            return false;
        }

    }
}
