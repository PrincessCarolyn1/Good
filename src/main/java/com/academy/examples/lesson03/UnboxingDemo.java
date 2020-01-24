package com.academy.examples.lesson03;

public class UnboxingDemo {
    public static void main(String[] args) {
        Integer m = 25;
        int n = m.intValue(); // так можно, но длинно
        int k = m; // OK. Автораспаковка
        System.out.println(n); // =>25
        System.out.println(k); // =>25
    }
}
