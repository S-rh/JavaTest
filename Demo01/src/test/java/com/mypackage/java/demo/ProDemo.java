package com.mypackage.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ProDemo {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        InputStream inputStream = ProDemo.class.getClassLoader().getResourceAsStream("db.properties");



        properties.load(inputStream);

        System.out.println(properties);

        /*properties.setProperty("username","root");
        properties.setProperty("password","root");
        System.out.println(properties);

        Set<String> keySet = properties.stringPropertyNames();
        for (String key : keySet) {
            System.out.println(key + "---" + properties.getProperty(key));
        }*/
    }


}
