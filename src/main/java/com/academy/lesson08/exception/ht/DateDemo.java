package com.academy.lesson08.exception.ht;

import com.academy.lesson04.hometask.Date;

public class DateDemo {
    public static void main(String[] args) {
        CorrectDate date1 = new CorrectDate(15, 11, 2019);
        CorrectDate date2 = new CorrectDate(-1, 11, 2019);

        System.out.println(date1.getFormattedDate());
        System.out.println(date2.getFormattedDate());
    }
}