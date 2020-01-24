package com.academy.lesson08.exception;

public class AppMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
//        System.out.println(calc.div(6, 3));
        try {
            System.out.println(calc.div(6, 3));
            System.out.println(calc.div(6, 0));
            System.out.println(calc.div(3, 1));
        } catch (DivisionByZero e) {
            System.err.println("Ошибка: нельзя делить на 0");
            System.err.println("Подробности: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка");
        }

        System.out.println("FINISH");
    }
}
