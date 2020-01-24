package com.academy.lesson04;

import com.academy.lesson05.figure.Square;

import java.util.Arrays;

public class ReferenceDemo {
    public static void main(String[] args) {
        int n = 5;
        method1(n);
        System.out.println(n);

        int[] array = {1, 2, 3};
        method2(array);
        System.out.println(Arrays.toString(array));

        Square square = new Square(5, "Orange");
        method3(square);
        System.out.println(square);
    }

    private static void method3(Square square) {
        square = new Square(100, "Gray");
        square.setSide(200);
        square.setColor("blue");
    }

    private static void method2(int[] array) {
        array[0] = 100;
    }

    private static void method1(int n) {
        n = 10;
    }
}
