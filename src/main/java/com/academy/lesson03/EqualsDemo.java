package com.academy.lesson03;

public class EqualsDemo {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 23;
        System.out.println("int n1 = 23;");
        System.out.println(n1 == n2); // true

        Integer m1 = 23;
        Integer m2 = 23;
        System.out.println("Integer m1 = 23;");
        System.out.println(m1 == m2); // true
        System.out.println(m1.equals(m2)); // true

        Integer k1 = 230;
        Integer k2 = 230;
        System.out.println("Integer k1 = 230;");
        System.out.println(k1 == k2); // false
        System.out.println(k1.equals(k2)); // false

        Double d1 = 23.0;
        Double d2 = 23.0;
        System.out.println(d1 == d2); // false
        System.out.println(d1.equals(d2)); // false

        // число в строку
        int n = 3;
        String nStr = Integer.toString(n);
        String nStr2 = n + "";
    }
}
