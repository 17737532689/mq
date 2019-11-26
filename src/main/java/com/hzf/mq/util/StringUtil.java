package com.hzf.mq.util;

import java.util.Arrays;
import java.util.List;

/**返回数组转换int集合
 * @param
 * @author yangchaojie
 * @return
 */
public class StringUtil {

    public static List<Integer> splitString(String[] id) {

        List<Integer> intsids = null;
        int i = 0;
        if (id != null) {
            Integer[] sid = new Integer[id.length];
            for (String s : id) {
                sid[i] = Integer.parseInt(s);
                i++;
            }
            if (sid.length > 0) {
                intsids = Arrays.asList(sid);
            }
        }else {
            return null;
        }

        return intsids;

    }
    public static List<String> splitStringName(String[] name) {


        if (name != null) {
            List<String> strings = Arrays.asList(name);
            return  strings;
        }else {
            return null;
        }

    }

    /**
     *
     * @param list
     * @param
     * @return
     */
    public static String listToString(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(",");
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }


}