package com.mypackage.java.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        //testScanner();
    }

    public static void testScanner() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }

    @Test
    public void testString() {
        String s1 = "sober";
        String s2 = "sober";
        String s3 = "Sober";
        String s4 = "qwertyuiopasdfghjklzxcvbnmsobersobersober";

        // equals
        System.out.println("s1.equals(s2):" + s1.equals(s2));

        // equalsIgnoreCase
        System.out.println("s1.equals(s3):" + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3):" + s1.equalsIgnoreCase(s3));

        // length
        System.out.println("s4.length():" + s4.length());

        // concat
        String s5 = s3.concat("_Echo");
        System.out.println("s5 = s3.concat(_Echo):" + s5);

        // charAt
        System.out.println("charAt:" + s4.charAt(14));

        // indexOf
        System.out.println("indexOf:" + s4.indexOf("sober"));

        System.out.println("substring" + s4.substring(10,20));

        String[] strings = s4.split("s");

        System.out.println("strings");
        for (String string : strings) {
            System.out.println(string);
        }

    }

    @Test
    public void testArrays() {
        int[] array = new int[]{12,32,54,12,65,17,21};
        System.out.println("排序前");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("排序后");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testMath() {
        double d1 = -12.3;
        double d2 = 12.4;
        double d3 = 12.56434242;

        System.out.println("abs:" + Math.abs(d1));
        System.out.println("ceil" + Math.ceil(d2));
        System.out.println("floor" + Math.floor(d2));
        System.out.println("round" + Math.round(d3));


    }


}
