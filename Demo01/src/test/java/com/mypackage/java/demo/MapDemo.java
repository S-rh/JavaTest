package com.mypackage.java.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + " " +map.get(s));
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

}
