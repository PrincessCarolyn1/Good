package com.academy.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExc {
    public static void main(String[] args) {
        // List<String> nameList = new ArrayList<>(Arrays.asList("", ""));
        List<String> nameList = new ArrayList<>();
        nameList.add("peter");
        nameList.add("helen");
        nameList.add("yakov");
        nameList.add("natali");
        nameList.add("ivan");
        nameList.add("sudor");
        nameList.add(3,"ашот");

        for(int i=0; i<nameList.size(); i++) {
            String name = nameList.get(i);
            String modifiedName = firstToUpperCase(name);
            nameList.set(i, modifiedName);
        }

        Collections.sort(nameList);
        System.out.println(nameList);
    }

    private static String firstToUpperCase(String value) {
        char firstLetter = value.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        String restLetters = value.substring(1);
        String result = firstLetter + restLetters;
        return result;
    }
}
