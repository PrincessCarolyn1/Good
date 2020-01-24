package com.academy.lesson07;

import java.util.Arrays;

import static com.academy.lesson06.Gender.FEMALE;
import static com.academy.lesson06.Gender.MALE;

public class TwoDimArrayDemo {
    public static void main(String[] args) {
        Object[][] array = {
                {"Peter", 23, MALE},
                {12, 34, 56, "Hello", "world"},
                {MALE, FEMALE, 34, "!!!"}
        };

        for (int row = 0; row < array.length; row++) {
            System.out.println();
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
        }

        System.out.println("***");
        System.out.println(Arrays.deepToString(array));
    }
}
