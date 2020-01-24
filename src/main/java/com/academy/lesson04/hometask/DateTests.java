package com.academy.lesson04.hometask;

public class DateTests {
    public static void main(String[] args) {
        Date date1 = new Date(21,12,2018);
        Date date2 = new Date(21,2,2018);
        Date date3 = new Date(21,22,2018);
        System.out.println(date1.getFormattedDate());
        System.out.println(date2.getFormattedDate());
        System.out.println(date3.getFormattedDate());
    }
}
