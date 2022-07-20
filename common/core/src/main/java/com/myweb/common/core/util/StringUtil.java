package com.myweb.common.core.util;

/**
 * @author chs
 * @date 2022/7/20 14:22
 * 字符串工具类
 */
public class StringUtil {

    public static final String EMPTY_STR = "";

    /**
     * 去除前后空格
     * @param str
     * @return
     */
    public static String trim(String str) {
        String resultStr = str == null ? EMPTY_STR : str.trim();
        return resultStr;
    }

    /**
     * 是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if(str == null){
            return true;
        }
        boolean result = EMPTY_STR.equals(str.trim());
        return result;
    }
}
