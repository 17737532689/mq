package com.hzf.mq.util;

import org.apache.commons.lang.StringUtils;


/**
 * 
 * Depiction：共通方法工具类
 * @author sunyx
 * @create 2019-07-18
 */
public class CommonUtil {


    /**
     * 根据String字符串,拼装String[]
     * 
     * @param key
     * @return
     */
    public static String[] getkeys(String key) {
        if (key != null && !"".equals(key)) {
            String[] Keys = key.split(",");
            return Keys;
        } else {
            return null;
        }
    }
    /**
     * 判断字符串是否为空，null,如果是返回false
     * @param str
     * @return
     */
    public static boolean notBankNll(String str){
        if("".equals(str.trim())||str==null){
            return false;
        }

        boolean notBlank = StringUtils.isNotBlank(StringUtils.trimToNull(str));

        return notBlank;
    }
    public static boolean nullBank(Object str){
        if("".equals(str)||str==null){
            return false;
        }else {
            return true;
        }


    }

}
