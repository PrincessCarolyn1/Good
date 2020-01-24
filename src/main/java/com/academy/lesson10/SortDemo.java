package com.academy.lesson10;

import com.academy.lesson06.Gender;
import com.academy.lesson06.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(3L, "Sidor", Gender.MALE));
        persons.add(new Person(4L, "Mihail", Gender.MALE));
        persons.add(new Person(1L, "Peter", Gender.MALE));
        persons.add(new Person(2L, "Helen", Gender.FEMALE));
        persons.add(new Person(5L, "Elizaveta", Gender.FEMALE));

        // Сортировка по умолчанию (по id по возрастанию)
        Collections.sort(persons);
        System.out.println(persons);

        // Сортировка по id по убыванию
        // 1 способ - длинный
        //persons.sort(new ComparatorPersonImpl());
        //System.out.println(persons);

        // 2 способ - лямбда
        persons.sort((p1, p2)-> {if (p1.getId() < p2.getId())
            return 1;

            if (p2.getId() < p1.getId())
                return -1;

            return 0;});

        System.out.println(persons);

        // по алфавиту
        System.out.println("по алфавиту");
        persons.sort((p1, p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println(persons);

        // по алфавиту
        System.out.println("по алфавиту в обратно порядке");
        persons.sort((p1, p2)-> p2.getFirstName().compareTo(p1.getFirstName()));
        System.out.println(persons);

        // по алфавиту
        System.out.println("снова по алфавиту");
        persons.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(persons);

        // по id
        System.out.println("снова id");
        persons.sort(Comparator.comparing(Person::getId));
        System.out.println(persons);

        // сначала женщины по алфавиту, мужчины по алф
        Comparator<Person> sortByGenderThenByName =
                (p1, p2)-> {
                    if (p1.getGender() == p2.getGender())
                        return p1.getFirstName().compareTo(p2.getFirstName());

                    if (p1.getGender().equals(Gender.FEMALE))
                        return -1;

                    else
                        return 1;
                };

        persons.sort(sortByGenderThenByName);

        System.out.println(persons);
    }
}
