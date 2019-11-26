package com.hzf.mq.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**运算
 * @param
 * @author yangchaojie
 * @return
 */
public class AlgorithmUtil {
    //整数相除 保留两位小数Float
    public static String divisionFoat(Float a ,Float b){
        String result = "";
        Float num =a/b;

        DecimalFormat df = new DecimalFormat("0.00");

        result = df.format(num);


        return  result;

    }

    // 保留一位小数
    public static String divisionDouble(Double num){
        String result = "";

        DecimalFormat df = new DecimalFormat("0.0");

        result = df.format(num);


        return  result;

    }
    //整数相除 保留两位小数
    public static String divisionTwo(Float a ,Float b){
        String result = "";
        Float num =a/b;

        DecimalFormat df = new DecimalFormat("0.00");

        result = df.format(num);


        return  result;

    }

    //比较大小

    public  static boolean compare(Double a,Double b){

        if(CommonUtil.nullBank(a)&&CommonUtil.nullBank(b)){
            double num = a -b;
            if(num>0){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();

    }
}
