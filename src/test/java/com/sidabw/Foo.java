package com.sidabw;

import java.util.Calendar;

public class Foo {

    static int DAY_IM = 60 * 60 * 24;

    public void go(){
        System.out.println("1111");
    }

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        Foo f = new Foo();
        f.go();


    }
}
