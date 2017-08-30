package com.drive.service.utils;

public class StringUtils {
    public static boolean isEmpty(String str)
    {
        return null == str || str.trim().length()==0?true:false;
    }

    public static boolean isNotEmpty(String str)
    {
        return !isEmpty(str);
    }
}
