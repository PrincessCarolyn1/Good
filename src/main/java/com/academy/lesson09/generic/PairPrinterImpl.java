package com.academy.lesson09.generic;

public class PairPrinterImpl<T, S> implements PairPrinter<T, S> {

    @Override
    public void print(T value1, S value2) {
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
    }
}
