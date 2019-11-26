package com.hzf.mq.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 * Depiction：日期工具类
 * 
 * @create 2014-03-01
 */
public class DateUtil {

    private static Log log = LogFactory.getLog(DateUtil.class);

    /**
     * 把java.util.Date对象格式化成指定格式的string类型
     * 
     * @param patternStr
     *            格式化后的格式
     * @param date
     * @return
     */
    public static String formatDate(String patternStr, Date date) {
        try {
            if (date == null) {
                return "";
            }
            SimpleDateFormat sdf = new SimpleDateFormat(patternStr);
            return sdf.format(date);
        } catch (Exception e) {
            log.error("\r\n", e);
        }
        return "";
    }

    /**
     * 将制定的Date对象格式化为默认的yyyy-MM-dd格式
     * 
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        Assert.notNull(date, "时间对象不能为空");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * @param dateString
     *            20060100,20051231,20060101 yyyy-MM-dd/yyyyMMdd/yyyyMM
     * @return
     */
    public static Date parse(String dateString) {
        try {
            if (dateString.length() <= 6) {
                return new SimpleDateFormat("yyyyMM").parse(dateString);
            } else if (dateString.indexOf("-") < 0 && dateString.length() == 8) {
                return new SimpleDateFormat("yyyyMMdd").parse(dateString);
            } else if (dateString.indexOf("-") < 0 && dateString.length() == 14) {
                return new SimpleDateFormat("yyyyMMddHHmmss").parse(dateString);
            } else if (dateString.length() == 7 && dateString.indexOf("-") > 0) {
                return new SimpleDateFormat("yyyy-MM").parse(dateString);
            } else if (dateString.length() == 19 && dateString.indexOf("-") > 0 && dateString.indexOf(":") > 0) {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
            } else {
                return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 判断某日期与当前日期是否为同一交易日期
     * 
     * @param date
     * @param separateTime
     *            分隔时间，默认为0时，格式应为HHmmss，长度为6个数字
     * @return
     */
    public static boolean isSameTransDay(Date date, String separateTime) {
        boolean ret = false;
        if (date == null) {
            return ret;
        }
        int hour = 0, minute = 0, second = 0;
        if (StringUtils.isNotBlank(separateTime) && separateTime.length() == 6) {
            hour = Integer.parseInt(separateTime.substring(0, 2));
            minute = Integer.parseInt(separateTime.substring(2, 4));
            second = Integer.parseInt(separateTime.substring(4));
        }

        Calendar a = Calendar.getInstance();
        a.set(Calendar.HOUR_OF_DAY, hour);
        a.set(Calendar.MINUTE, minute);
        a.set(Calendar.SECOND, second);
        Calendar b = Calendar.getInstance();
        b.setTime(date);
        long millis = a.getTimeInMillis() - b.getTimeInMillis();
        return millis >= 0 && millis < 86400000;
    }

    /**
     * 判断某日期是否为今天
     * 
     * @param date
     * @return
     */
    public static boolean isToday(Date date) {
        if (date == null) {
            return false;
        }
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        b.setTime(date);
        return a.get(Calendar.DAY_OF_MONTH) == b.get(Calendar.DAY_OF_MONTH)
                && a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.YEAR) == b.get(Calendar.YEAR);
    }

    /**
     * 判断某日期是否为本周
     * 
     * @param date
     * @return
     */
    public static boolean isWeek(Date date) {
        if (date == null) {
            return false;
        }
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        b.setTime(date);
        return a.get(Calendar.WEEK_OF_MONTH) == b.get(Calendar.WEEK_OF_MONTH)
                && a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.YEAR) == b.get(Calendar.YEAR);
    }

    /**
     * 当前时间增加指定分钟数后得到的时间
     * 
     * @param minuteAmount
     * @return
     */
    public static Date addMinutes(int minuteAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, minuteAmount);
        return calendar.getTime();
    }

    /**
     * 当前时间增加指定分钟数后得到的时间
     * 
     * @param minuteAmount
     * @return
     */
    public static Date addMinutes(Date d, int minuteAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.MINUTE, minuteAmount);
        return calendar.getTime();
    }
    
    /**
     * 当前时间增加指定小时数后得到的时间
     * 
     * @param hourAmount
     * @return
     */
    public static Date addHours(int hourAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, hourAmount);
        return calendar.getTime();
    }
    
    /**
     * 指定时间增加指定小时数后得到的时间
     * 
     * @param //dayAmount
     * @return
     */
    public static Date addHours(Date d, int hourAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR_OF_DAY, hourAmount);
        return calendar.getTime();
    }

    /**
     * 当前时间增加指定天数后得到的时间
     * 
     * @param dayAmount
     * @return
     */
    public static Date addDays(int dayAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, dayAmount);
        return calendar.getTime();
    }
    
    /**
     * 指定时间增加指定天数后得到的时间
     * 
     * @param dayAmount
     * @return
     */
    public static Date addDays(Date d, int dayAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.DAY_OF_MONTH, dayAmount);
        return calendar.getTime();
    }
    /**
     * 当前时间增加指定月数后得到的时间
     * 
     * @return
     */
    public static Date addMonth(int monthAmount) {
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(new Date());
    	calendar.add(Calendar.MONTH, monthAmount);
    	return calendar.getTime();
    }
    
    /**
     * 指定时间增加指定月数后得到的时间
     * 
     * @return
     */
    public static Date addMonth(Date d, int monthAmount) {
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(d);
    	calendar.add(Calendar.MONTH, monthAmount);
    	return calendar.getTime();
    }
    
    /**
     * 由当前时间取前一周
     */
    public static Date addDaysOnSpecifiedTime(int dayAmount){
        Date startTime = addDays(-6);
    	Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.add(Calendar.DAY_OF_MONTH, dayAmount);
        return calendar.getTime();
    }
   
    /**
     * 由当前时间得本周第一天
     * 
     */
    public static Date dayOfWeek() {
        Calendar c = Calendar.getInstance();
        int dayofweek = c.get(Calendar.DAY_OF_WEEK) - 1;
        if (dayofweek == 0)
            dayofweek = 7;
        c.add(Calendar.DATE, -dayofweek + 1);
        return c.getTime();
    }

    /**
     * 由当前时间得本周最后一天
     * 
     */
    public static Date endOfWeek() {
        Calendar c = Calendar.getInstance();
        int dayofweek = c.get(Calendar.DAY_OF_WEEK) - 1;
        if (dayofweek == 0)
            dayofweek = 7;
        c.add(Calendar.DATE, -dayofweek + 7);
        return c.getTime();
    }

    /**
     * 由当前时间得本月第一天
     * 
     * @author tangjingyuan
     * @info 本月的首日日期，获取的时钟不精确
     */
    public static Date dayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    /**
     * 由当前时间得本月第一天
     * 
     * @author tangjingyuan
     * @info 本月的首日日期，获取的时钟不精确
     */
    public static Long OnedayOfMonth() {
        long monTime = DateUtil.parse(DateUtil.formatDate("yyyyMMdd", DateUtil.dayOfMonth()) + "000000").getTime(); // 本月第一天
        return monTime;
    }
    
    /**
     * 由当前时间得本月最后一天
     * 
     */
    public static Date endOfMonth() {
        Calendar calendar = Calendar.getInstance();
        // 设置时间,当前时间不用设置
        // calendar.setTime(new Date());
        // 设置日期为本月最大日期
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        return calendar.getTime();
    }
    
    /**
     * 由传入时间得本月第一天
     * @param date
     * @return
     */
    public static Date firstDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        // 设置时间,当前时间不用设置
         calendar.setTime(date);
        // 设置日期为本月最大日期
        calendar.set(Calendar.DATE, calendar.getMinimum(Calendar.DATE));
        return calendar.getTime();
    }
    
    /**
     * 由传入时间得本月最后一天
     * @param date
     * @return
     */
    public static Date endDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        // 设置时间,当前时间不用设置
        calendar.setTime(date);
        // 设置日期为本月最大日期
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        return calendar.getTime();
    }

    /**
     * 由当前时间得今年第一天
     * 
     */
    public static Date dayOfYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(GregorianCalendar.DAY_OF_YEAR, 1);
        return calendar.getTime();
    }

    /**
     * date2比date1多的天数
     * @param date1    
     * @param date2
     * @return    
     */
    public static int differentDays(Date date1,Date date2){
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2){//同一年
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年            
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2-day1) ;
        }else {//不同年
            return day2-day1;
        }
    }


    public static void main(String[] args) {
        System.out.println(addMinutes(50));
    }

    /**
     * 传入开始时间和结束时间，返回时间段每隔一分钟所有的时间
     * @param stime
     * @param etime
     * @return
     * @throws ParseException
     */
    public static List<String> findDates(String stime, String etime)
            throws ParseException {
        List<String> allDate = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");

        Date dBegin = sdf.parse(stime);
        Date dEnd = sdf.parse(etime);
        allDate.add(sdf.format(dBegin));
        Calendar calBegin = Calendar.getInstance();
// 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
// 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
// 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
// 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.MINUTE, 1);
            allDate.add(sdf.format(calBegin.getTime()));
        }
        return allDate;
    }

    /**
     * 把yyyy-MM-ddHH:mm:ss  String类型时间转化yyyyMMddHHmmss
     * @param time
     * @return
     */
   public static String dateString(String time)  {
       if(time==null&&"".equals(time)){
           return null;
       }
       SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
       SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMddHHmmss");
       Date  startTime1 = null;
       try {
           startTime1 = f.parse(time);
           String startTime2 = f2.format(startTime1);
           return  startTime2;
       } catch (ParseException e) {
           e.printStackTrace();
           return  null;
       }

   }

    /**
     * 把yyyy-MM-ddHH:mm:ss 集合  String类型时间转化yyyyMMddHHmmss集合
     * @param time
     * @return
     */
    public static List<String> stringList(List<String> time)  {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMddHHmmss");

        List<String> dateList=new ArrayList();
        Date  startTime1 = null;
        try {
            for(String s:time){
                startTime1 = f.parse(s);
                String startTime2 = f2.format(startTime1);
                dateList.add(startTime2);
            }

            return  dateList;
        } catch (ParseException e) {
            e.printStackTrace();
            return  null;
        }

    }

    public static  String stringTime(String time){

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String format=null;
        try {

            if(time!=null&&!"".equals(time)){
                Date date = f2.parse(time);
                format = f.format(date);

            }else {
                return null;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return format;


    }
    public static String formatString(Date date){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = f.format(date);
        return format;
    }
    /**
     * 当前时间减少指定小时数后得到的时间
     *
     * @param hourAmount
     * @return
     */
    public static String reHours(Date hourAmount) {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(hourAmount);
        calendar.set(Calendar.HOUR_OF_DAY,calendar.get(Calendar.HOUR_OF_DAY)-1);
       // calendar.(Calendar.HOUR, hourAmount);
        Date time = calendar.getTime();
        String sTime = formatString(time);

        return sTime;
    }

    /**
     *字符转日期
     * @return
     */
    public static  Date stringTodate(String Dater){

        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//yyyy-MM-ddHH:mm:ss
        Date date = null;
        try {
            date = f.parse(Dater);
            return date;
        } catch (ParseException e) {
            return  null;
        }
    }
}
