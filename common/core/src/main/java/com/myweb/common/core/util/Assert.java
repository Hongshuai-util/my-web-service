package com.myweb.common.core.util;

import com.myweb.common.core.exception.ServiceException;

import java.math.BigDecimal;

/**
 * @author chs
 * @date 2022/7/20 14:27
 * 断言
 */
public class Assert {

    public static Boolean isEmpty(Integer num){
        if(num == null || num <= 0){
            return true;
        }
        return false;
    }

    public static Boolean isEmpty(Long num){
        if(num == null || num <= 0){
            return true;
        }
        return false;
    }

    public static Boolean isEmpty(BigDecimal num){
        if(num == null || num.doubleValue() <= 0){
            return true;
        }
        return false;
    }

    public static Boolean isEmpty(String str){
        return StringUtil.isEmpty(str);
    }

    public static void isNotEmpty(Long num, String message){
        if(isEmpty(num)){
            throw new ServiceException(message);
        }
    }

    public static void isNotEmpty(Integer num, String message){
        if(isEmpty(num)){
            throw new ServiceException(message);
        }
    }

    public static void isNotEmpty(String num, String message){
        if(isEmpty(num)){
            throw new ServiceException(message);
        }
    }

    public static void isNotEmpty(BigDecimal num, String message){
        if(isEmpty(num)){
            throw new ServiceException(message);
        }
    }
}
