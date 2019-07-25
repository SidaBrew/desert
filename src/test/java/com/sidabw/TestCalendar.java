package com.sidabw;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {

    @Test
    public void method(){

        Calendar cale = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        cale.add(Calendar.MONTH,0);
        cale.set(Calendar.DAY_OF_MONTH,1);
        String firstDay = simpleDateFormat.format(cale.getTime());
        cale.add(Calendar.MONTH,1);
        cale.set(Calendar.DAY_OF_MONTH,0);
        String lastDay = simpleDateFormat.format(cale.getTime());
        System.out.println(firstDay);

    }
}
