package com.myweb.common.core.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author chs
 * @date 2022/7/18 17:11
 * BigDecimal工具类
 */
public class DecimalUtil {

    /**
     * 相加 (value1 + value2)
     * @param value1
     * @param value2
     * @return
     */
    public static BigDecimal add(BigDecimal value1, BigDecimal value2){
        BigDecimal add = value1.add(value2);
        return add;
    }

    /**
     * 相减 (value1 - value2)
     * @param value1
     * @param value2
     * @return
     */
    public static BigDecimal subtract(BigDecimal value1, BigDecimal value2){
        BigDecimal subtract = value1.subtract(value2);
        return subtract;
    }

    /**
     * 相乘 (value1 * value2)
     * @param value1
     * @param value2
     * @return
     */
    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2){
        BigDecimal multiply = value1.multiply(value2);
        return multiply;
    }

    /**
     * 相除 (value1 / value2)
     * 四舍五入，保留两位小数
     * @param value1
     * @param value2
     * @return
     */
    public static BigDecimal divide(BigDecimal value1, BigDecimal value2){
        BigDecimal divide = divide(value1, value2, 2);
        return divide;
    }

    /**
     * 相除 (value1 / value2)
     * 四舍五入
     * @param value1
     * @param value2
     * @param scale 保留的小数位数
     * @return
     */
    public static BigDecimal divide(BigDecimal value1, BigDecimal value2, Integer scale){
        BigDecimal divide = divide(value1, value2, scale, RoundingMode.HALF_UP);
        return divide;
    }

    /**
     * 相除 (value1 / value2)
     * @param value1
     * @param value2
     * @param scale 保留的小数位数
     * @param roundingMode 舍入的方式
     * @return
     */
    public static BigDecimal divide(BigDecimal value1, BigDecimal value2, Integer scale, RoundingMode roundingMode){
        BigDecimal divide = value1.divide(value2, scale, roundingMode);
        return divide;
    }


    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal("1");
        BigDecimal v2 = new BigDecimal("3");
        System.out.println(divide(v1, v2, 3));
    }
}

