package com.easyquestionnaire.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String getCurrentDateTimeToString() {
        SimpleDateFormat dateformater = new SimpleDateFormat("yyyyMMddHHmmss");
        Date currentDate = new Date();

        return dateformater.format(currentDate);
    }
}
