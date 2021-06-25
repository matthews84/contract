package com.whxisoft.util;

import org.springframework.util.StringUtils;

import java.util.UUID;

public class StringUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getGUID() {
        return UUID.randomUUID().toString().toUpperCase();
    }

    public static String removeLastComma(String str) {
        if (StringUtils.hasLength(str)) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
