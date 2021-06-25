package com.whxisoft.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(dtf);
    }

    public static String getCurrentTimeAddMinutes(int minutes) {
        LocalDateTime time = LocalDateTime.now().plusMinutes(minutes);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return time.format(dtf);
    }
}
