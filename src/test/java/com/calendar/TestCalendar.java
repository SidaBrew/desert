package com.calendar;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {

    @Test
    public void method(){

        Calendar cale = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
//          cale.add(Calendar.DAY_OF_MONTH,0);//当前时间（这个月的某一天）
//          cale.add(Calendar.MONTH,0);
//          cale.add(Calendar.DAY_OF_MONTH,1);//当前时间+1
//          cale.set(Calendar.DAY_OF_MONTH,22);//设置这个月的第几天
//
//          cale.add(Calendar.YEAR,2);//获取当前年 +2年
//          cale.add(Calendar.DAY_OF_WEEK,1);//????
        cale.set(Calendar.DAY_OF_YEAR,2);
        System.out.println(simpleDateFormat.format(cale.getTime()));
        String newDate ="2019-8-15";
    }
}
