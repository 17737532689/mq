package com.hzf.mq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.hzf.mq.condition.DDataMinCarsCondition;
import com.hzf.mq.entity.DDataMinCars;
import com.hzf.mq.enums.QueueConstants;
import com.hzf.mq.service.IRabbitSend;
import com.hzf.mq.util.CommonUtil;
import com.hzf.mq.util.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Service
@Component
@Slf4j
public class RabbitSendImpl extends  BaseService implements  IRabbitSend  {
   @Autowired
    private AmqpTemplate rabbitTemplate;
    @Override
    public Message sendToMQ(DDataMinCarsCondition condition) {
        Message message = new Message();
        Gson gson =new Gson();
        JSONArray gas = condition.getGas();
        List<DDataMinCars> dDataMinCars = JSONArray.parseArray(gas.toString(), DDataMinCars.class);
        for (DDataMinCars d : dDataMinCars) {
            String s = gson.toJson(d);
            rabbitTemplate.convertAndSend(QueueConstants.QUEUE_TEST1.getCode(), s);
            if(CommonUtil.nullBank(d.getCar_picture())){
                d.setCar_picture(null);
            }
            log.info("生产者分钟"+d);
        }
        message.setCount(200);
        message.setMsg("success");
        return message;
    }
}
