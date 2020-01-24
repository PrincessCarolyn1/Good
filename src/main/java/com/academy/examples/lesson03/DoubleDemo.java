package com.academy.examples.lesson03;

public class DoubleDemo {
    public static void main(String[] args) {
        // Статические методы
        System.out.println(Double.MIN_VALUE);    // => 4.9E-324
        System.out.println(Double.MIN_NORMAL);   // => 2.2250738585072014E-308
        System.out.println(Double.MIN_EXPONENT); // => -1022

        System.out.println(Double.MAX_VALUE);    // => 1.7976931348623157E308
        System.out.println(Double.MAX_EXPONENT); // => 1023

        System.out.println(Double.NEGATIVE_INFINITY); // => -Infinity
        System.out.println(Double.POSITIVE_INFINITY); // => Infinity
        System.out.println(Double.NaN); // => NaN

        Double positiveInf = 1.0/0;
        Double negativeInf = -1.0/0;
        Double nan = 0.0/0;

        System.out.println(positiveInf); // => Infinity
        System.out.println(negativeInf); // => -Infinity
        System.out.println(nan);         // => NaN

        System.out.println(Double.isFinite(1.0));   // =>  true
        System.out.println(Double.isFinite(1.0/0)); // => false

        System.out.println(Double.isInfinite(1.0));   // => false
        System.out.println(Double.isInfinite(1.0/0)); // => true
        System.out.println(Double.isNaN(0.0/0));      // => true

        // Методы экземпляра
        Double pi = 3.14159;
        System.out.println(pi.isInfinite()); // => false
        System.out.println(pi.isNaN());      // => false

        // Остальные метода аналагичны классу Integer
    }
}
