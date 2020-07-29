package com.mypackage.java.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));

        long time = date.getTime();
        System.out.println(time);


    }

}
