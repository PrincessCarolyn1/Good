package com.academy.examples.lesson03;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        String str1 = array.toString(); // нестатический метод
        String str2 = Arrays.toString(array); // статический метод
    }
}
