package com.academy.lesson08;

public class ExcMain {
    public static void main(String[] args) {
       Object[] array = {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};
       // только строки
        for (Object el : array) {
            if (el.getClass() == String.class)
                System.out.println(el);
        }

//        // только числа
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer)
                System.out.println(array[i]);
        }
        System.out.println("---array2D---");
        Object[][] array2D = {{"Ivan", 34}, {"Kolya", 56}, {"Boris", 18}, {"Kolya", 18}, {"Peter", 15}, {"Helen", 45}, {"Kolya", 32}};
//        array2D[0][1]
//        // только строки
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(array2D[i][0]);
        }
//
//        // только числа
        for (Object[] pair : array2D) {
            System.out.println(pair[1]);
        }
    }
}
