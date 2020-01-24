package com.academy.examples.lesson03;

public class BooleanDemo {
    public static void main(String[] args) {
        // Статические методы
        System.out.println(Boolean.compare(false, true));  // => -1
        System.out.println(Boolean.compare(false, false)); // => 0
        System.out.println(Boolean.compare(true, false));  // => 1
        System.out.println(Boolean.compare(true, true));   // => 0

        boolean b1 = Boolean.getBoolean("false");
        boolean b2 = Boolean.getBoolean("true");

        boolean b3 = Boolean.parseBoolean("false");
        boolean b4 = Boolean.parseBoolean("true");

        Boolean b5 = Boolean.valueOf("false");
        Boolean b6 = Boolean.valueOf("true");

        Boolean b7 = Boolean.FALSE;
        Boolean b8 = Boolean.TRUE;

        // &&
        System.out.println(Boolean.logicalAnd(true, true));  // => true
        System.out.println(Boolean.logicalAnd(false, true)); // => false
        System.out.println(Boolean.logicalAnd(true, false)); // => false
        System.out.println(Boolean.logicalAnd(false, false));// => false

        // ||
        System.out.println(Boolean.logicalOr(true, true)); // => true
        System.out.println(Boolean.logicalOr(false, true)); // => true
        System.out.println(Boolean.logicalOr(true, false)); // => true
        System.out.println(Boolean.logicalOr(false, false)); // => false

        // ^
        System.out.println(Boolean.logicalXor(true, true));  // => false
        System.out.println(Boolean.logicalXor(false, true)); // => true
        System.out.println(Boolean.logicalXor(true, false)); // => true
        System.out.println(Boolean.logicalXor(false, false));// => false

        // Методы экземпляра
        Boolean flagTrue = true;
        Boolean flagFalse = false;
        boolean flag2 = flagTrue; // true
        boolean flag3 = flagTrue.booleanValue(); // true

        System.out.println(flagTrue.compareTo(flagTrue));   // => 0
        System.out.println(flagTrue.compareTo(flagFalse));  // => 1

        System.out.println(flagFalse.compareTo(flagTrue));  // => -1
        System.out.println(flagFalse.compareTo(flagFalse)); // => 0
    }
}
