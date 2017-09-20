package com.drive.service.utils;

public class StringUtils {
    public static boolean isEmpty(String str)
    {
        if(null == str)
        {
            return true;
        }

        return str.trim().length()==0?true:false;
    }

    public static boolean isNotEmpty(String str)
    {
        return !isEmpty(str);
    }

}
