package com.academy.examples.lesson03;

public class IntegerDemo {
    public static void main(String[] args) {
        // Статические методы
        System.out.println(Integer.MIN_VALUE); // => -2147483648
        System.out.println(Integer.MAX_VALUE); // => 2147483647

        String str = "32";
        int number = Integer.parseInt(str); // строку в число
        int number2 = Integer.valueOf(str); // строку в число
        System.out.println(number);  // => 32
        System.out.println(number2); // => 32

        String s1 = Integer.toString(32); // число в строку

        System.out.println(Integer.compare(5, 10));  // => -1
        System.out.println(Integer.compare(10, 10)); // => 0
        System.out.println(Integer.compare(10, 5));  // => 1

        System.out.println(Integer.max(5, 10)); // => 10
        System.out.println(Integer.min(5, 10)); // => 5

        System.out.println(Integer.signum(-5)); // => 5

        System.out.println(Integer.sum(5, 10)); // => 15

        // Методы экземпляра
        Integer m = 10;
        // Double d = (Double)m; Ошибка компиляции
        Double d = m.doubleValue(); // Double из Integer
        double d2 = m.doubleValue(); // Double из Integer
        Long l = m.longValue();     // Long из Integer
        long l2 = m.longValue();     // Long из Integer

        int n = 5;
        Double d3 = Integer.valueOf(n).doubleValue(); // int to Double

        System.out.println(m.compareTo(5));  // => -1
        System.out.println(m.compareTo(10)); // => 0
        System.out.println(m.compareTo(15)); // => 1

        System.out.println(m.equals(5));  // => false
        System.out.println(m.equals(10)); // => true

        String s2 = m.toString(); // число в строку
    }
}
