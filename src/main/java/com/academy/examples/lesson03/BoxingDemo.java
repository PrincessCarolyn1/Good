package com.academy.examples.lesson03;

public class BoxingDemo {
    public static void main(String[] args) {
        int n = 20;
        Integer m = 25; // OK
        Integer m2 = Integer.valueOf(25); // так можно, но длинно
        Integer m3 = new Integer(25); // а так не нужно (технически можно)
        System.out.println(m); // => 25
        m = n; // OK автоупаковка
        System.out.println(m); // => 20
    }
}
