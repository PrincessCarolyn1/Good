package com.academy.lesson06;

public class Wrestler extends Person {

    public void fight() {
        System.out.println("Борюсь");
    }

    @Override
    public void about() {
        System.out.println("Я чемпион");
    }
}
