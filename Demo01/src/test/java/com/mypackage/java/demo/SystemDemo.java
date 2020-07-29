package com.mypackage.java.demo;

public class SystemDemo {

    public static void main(String[] args) {

        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);

        int[] arr1 = new int[] {11,33,76,776,832,12,43,54};
        int[] arr2 = new int[] {12,34,56,7,43,54,55,33,22,66,88,443,221};
        System.arraycopy(arr1,0,arr2,0,4);
        for (int i : arr2) {
            System.out.print(i + " ");
        }


    }

}
