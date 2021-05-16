package com.hdwang.ioc.core.utils;

/**
 * 字符串工具类
 */
public class StringUtils {

    /**
     * 判断字符串是否空白
     *
     * @param str 字符串
     * @return 字符串是否空白
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * 判断字符串是否非空白
     *
     * @param str 字符串
     * @return 字符串是否非空白
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}
