package com.hzf.mq.util;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class IntUntil {
    /**
     * 浮点数转整数
     * @param a
     * @return
     */
    public static Integer floatToInt(Float a){
        String str = String.valueOf(a);//浮点变量a转换为字符串str
        int idx = str.lastIndexOf(".");//查找小数点的位置
        String strNum = str.substring(0,idx);//截取从字符串开始到小数点位置的字符串，就是整数部分
        Integer num = Integer.valueOf(strNum);//把整数部分通过Integer.valueof方法转换为数字

        return  num;
    }
}
