package com.academy.lesson07;

import com.academy.lesson06.Gender;

import static com.academy.lesson06.Gender.FEMALE;
import static com.academy.lesson06.Gender.MALE;

public class ExcDemo {
    public static void main(String[] args) {
       Object[] array = {"Peter", MALE, 23};
        System.out.println("Имя: " + array[0] + " пол: " + array[1] +  " возраст: " + array[2]);

        Object[][] listOfPeople = new Object[4][3];
        listOfPeople[0] = array;
        listOfPeople[1] = new Object[]{"Boris", MALE, 26};
        listOfPeople[2] = new Object[]{"Helen", FEMALE, 43};
        listOfPeople[3] = new Object[]{"Ivan", MALE, 88};

        // Вывести listOfPeople
        for(int i = 0; i < listOfPeople.length; i++)
            System.out.println("Имя: " + listOfPeople[i][0] + " пол: " + listOfPeople[i][1]+  " возраст: " + listOfPeople[i][2]);
    }
}
