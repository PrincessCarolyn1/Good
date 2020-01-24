package com.academy.lesson10;

import com.academy.lesson04.hometask.Date;

import java.util.ArrayList;
import java.util.List;

//1) a) Создать List<Date> с разными значениями даты
//        (Date использовать реализовнный ранее).
//        b) Отсортировать даты по возрастанию и вывести список
//        с) Отфильтровать список, оставив только даты с месяцами:
//        январь февраль март
//        d) Выполнить сортировку
//        по годам по убыванию
//        по месяцам по возрастанию
//        по дням по возрастанию
//        => 01.01.2019, 01.01.2018, 01.02.2018, 02.02.2018, 01.01.2017
public class HomeTask {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(05,02,2018));
        dates.add(new Date(01,01,2019));
        dates.add(new Date(01,01,2017));
        dates.add(new Date(01,02,2018));
        dates.add(new Date(01,01,2018));

        dates.sort((d1, d2)->{
            if (d1.getYear() > d2.getYear())
                return -1;

            if (d1.getYear() < d2.getYear())
                return 1;

            // Года равны
            if (d1.getMonth() < d2.getMonth())
                return -1;

            if (d1.getMonth() > d2.getMonth())
                return 1;

            // Года и месяца равны
            if (d1.getDay() < d2.getDay())
                return -1;

            if (d1.getDay() > d2.getDay())
                return 1;

            // Года, месяца и дни равны
            return 0;
        });

        System.out.println(dates);
    }
}
