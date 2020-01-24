package com.academy.lesson06;

public class ItSpecialist extends Person {

    public void doTest() {
        System.out.println("Я разрабатываю автотесты");
    }

    @Override
    public void about() {
        System.out.println("Я тестировщик");
    }
}
