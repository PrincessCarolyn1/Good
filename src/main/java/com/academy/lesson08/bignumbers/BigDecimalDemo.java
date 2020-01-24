package com.academy.lesson08.bignumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(1.0/3);
        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");
        BigDecimal result = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(result);

        BigDecimal b3 = new BigDecimal("2.0");
        BigDecimal b4 = new BigDecimal("2.00");

        System.out.println(b3 == b4);
        System.out.println(b3.equals(b4));
        System.out.println(b3.compareTo(b4));

        System.out.println(b3);
        System.out.println(b4);


    }
}
