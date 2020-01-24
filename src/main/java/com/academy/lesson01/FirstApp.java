package com.academy.lesson01;


import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
        // Выводим сообщение на консоль
        System.out.println("Моя первая программа");

        // прочитаем с консоли
        // Связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);
        // Введем имя
        System.out.println("Введите имя: ");
        String firstName = scanner.next();

        System.out.println("Введите фамилия: ");
        String lastName = scanner.next();

        // Введим возраст
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Имя %s, фамилия %s, возраст %d",
                firstName, lastName, age));
    }
}
