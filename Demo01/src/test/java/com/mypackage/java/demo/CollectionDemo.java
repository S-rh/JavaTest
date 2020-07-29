package com.mypackage.java.demo;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(200));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

    }

}
