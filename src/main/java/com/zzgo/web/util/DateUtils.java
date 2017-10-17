package com.zzgo.web.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    //获得时间
    public static Date getTimeStamp() {
        return new Timestamp(Calendar.getInstance()
                .getTime().getTime());
    }

    public static void main(String[] args) {
        System.out.println(getTimeStamp());
    }
}
