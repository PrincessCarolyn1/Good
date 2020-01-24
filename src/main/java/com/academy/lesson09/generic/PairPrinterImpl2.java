package com.academy.lesson09.generic;

public class PairPrinterImpl2 implements PairPrinter<String, Integer> {

    @Override
    public void print(String value1, Integer value2) {
        System.out.println("V1: " + value1);
        System.out.println("V2: " + value2);
    }
}
