package com.academy.lesson03;

import java.util.Arrays;

public class ArrayExc {
    public static void main(String[] args) {
        String[] all = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};

        // Копируем в группы
        String[] group1 = Arrays.copyOf(all, 4);
        String[] group2 = Arrays.copyOfRange(all, 4, 8);

        // Выведем на консоль
        print(all, group1, group2);

        // сравнить группы
        checkGroups(group1, group2);
  }

    public static void print(String[] all, String[] group1, String[] group2) {
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
    }

    public static void checkGroups(String[] group1, String[] group2) {
        java.util.Arrays.sort(group1);
        java.util.Arrays.sort(group2);

        System.out.println(group1 == group2); // так не работает
        System.out.println("Group1 and Group2 are equal - " + Arrays.equals(group1, group2));
    }
}
