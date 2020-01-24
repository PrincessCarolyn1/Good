package com.academy.lesson04;

import java.util.Arrays;

public class ExcNames {
    public static void main(String[] args) {
        String rawData = "petrov,Ivanov ,KiRill, Helen ";
        rawData.length();
        String[] preparedNames = rawData.split(",");
        // => [Petrov, Ivanov ,Kirill, Helen];
        for(int i=0; i < preparedNames.length; i++) {
            // 1) обрежем пробелы
            preparedNames[i] = preparedNames[i].trim();
            // 2) все символы в нижий регистр
            preparedNames[i] = preparedNames[i].toLowerCase();
            // 3) 1-ый символ в верхний регистр
            char firstLetter = preparedNames[i].charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            String lastLetters = preparedNames[i].substring(1);
            preparedNames[i] = firstLetter + lastLetters;
            System.out.println(preparedNames[i]);
        }
        System.out.println(Arrays.toString(preparedNames));

        //========================================

        String[] preparedNames2 = rawData.split(",");
        // => [Petrov, Ivanov ,Kirill, Helen];

        for(int i=0; i < preparedNames2.length; i++) {
            // 1) обрежем пробелы
            preparedNames2[i] = preparedNames2[i].trim();
            // 2) все символы в нижий регистр
            preparedNames2[i] = preparedNames2[i].toLowerCase();
            // 3) 1-ый символ в верхний регистр
            String firstLetter = Character.toString(preparedNames2[i].charAt(0));
            preparedNames2[i] = preparedNames2[i].replaceFirst(firstLetter, firstLetter.toUpperCase());
            System.out.println(preparedNames2[i]);
        }
        System.out.println(Arrays.toString(preparedNames2));

        //========================================

        String[] preparedNames3 = rawData.split(",");
        // => [Petrov, Ivanov ,Kirill, Helen];
        for(int i=0; i < preparedNames3.length; i++) {
            // 1) обрежем пробелы
            preparedNames3[i] = preparedNames3[i].trim();
            // 2) все символы в нижий регистр
            char[] letters = preparedNames3[i].toCharArray();
            letters[0] = Character.toUpperCase(letters[0]);
            for (int j = 1; j < letters.length; j++) {
                letters[j] = Character.toLowerCase(letters[j]);
            }
            preparedNames3[i] = new String(letters);
        }
        System.out.println(Arrays.toString(preparedNames3));
    }
}
