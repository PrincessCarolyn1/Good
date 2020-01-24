package com.academy.lesson09.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(345);
        set.add(2);
//        set.add(2);
//        set.add(2);
//        set.add(2);
        set.add(-9);

        System.out.println(set);
        List<Integer> expectedData = new ArrayList<>();
        expectedData.add(1);
        expectedData.add(1);
        expectedData.add(3);
        expectedData.add(5);

        List<Integer> actualData = new ArrayList<>();
        actualData.add(3);
        actualData.add(3);
        actualData.add(5);
        actualData.add(1);

        System.out.println(actualData.equals(expectedData));
        Set<Integer> actualSet = new HashSet<>(actualData);
        Set<Integer> expectedSet = new HashSet<>(expectedData);
        System.out.println(actualSet.equals(expectedSet));
    }
}
