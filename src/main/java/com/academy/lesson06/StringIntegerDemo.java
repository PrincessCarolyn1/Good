package com.academy.lesson06;

public class StringIntegerDemo {
    public static void main(String[] args) {
        String[] strArr = {"One", "Two", "Three"};
        int[] intArr = {1, 4, 5};

        Object[] commonArray = {"One", 3, "Five", 34, 40, 3.14, new Wrestler()};
        for (int i = 0; i < commonArray.length; i++) {
            if(commonArray[i] instanceof Number)
                System.out.println(commonArray[i]);
        }
    }
}
