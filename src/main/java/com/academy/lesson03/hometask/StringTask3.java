package com.academy.lesson03.hometask;

import java.util.Arrays;

public class StringTask3 {
    public static void main(String[] args) {
        // 1 способ
        String str = "adfadhellosdfaHellodshellohellohelloasdfads";
        String sub = "hello";

        String str1 = "hhhh";
        String sub1 = "hh";

        int count = 0;
        int i = 0; // 5
        while(true) {
            i = str.indexOf(sub, i);
            if (i == -1)
                break;
            count++;
            i++;
        }
        System.out.println("Words = " + count);
//        int i = str.indexOf(sub, 28);
//        System.out.println(i);

//        String[] split = str.split(sub);
//        System.out.println(Arrays.toString(split));
//        System.out.println(split.length);

        // 2 способ неудобный
        String str2 = "adfadhellosdfaHellodshellohellohelloasdfads";
        String sub2 = "hello";
        int count2 = 0;

        for (int j = 0; ; j++) {
            j = str2.indexOf(sub2, j);
            if (j == -1)
                break;
            count2++;
        }
        System.out.println(count2);
    }
}
