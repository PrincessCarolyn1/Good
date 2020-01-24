package com.academy.lesson10;

import com.academy.lesson04.hometask.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(05,02,2018));
        dates.add(new Date(01,01,2019));
        dates.add(new Date(01,01,2017));
        dates.add(new Date(01,02,2018));
        dates.add(new Date(01,01,2018));

        dates.stream()
                .filter(d->d.getYear() == 2018)
                .peek(d->d.setDay(12))
                .map(d->d.getDay() + "." + d.getMonth() + "." + d.getYear() + " н.э.")
                .forEach(System.out::println);
//                .forEach(System.out::println);

        //System.out.println(dates);
        System.out.println("----------");
        long count = Arrays.stream(new String[]{"one", "two", "three", "two"})
                .filter("two"::equals)
                .count();

        System.out.println(count);

        List<String> result = Arrays.stream(new String[]{"one", "two", "three", "two"})
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
