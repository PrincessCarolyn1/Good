package com.academy.lesson06;

import com.academy.lesson06.skill.Musician;
import com.academy.lesson06.skill.QA;
import com.academy.lesson06.skill.Wrestler;

public class Talented implements QA, Musician, Wrestler {
    @Override
    public void play() {
        System.out.println("Я крутой музыкант");

    }

    @Override
    public void doTest() {
        System.out.println("Я классный тестер");
    }

    @Override
    public void fight() {
        System.out.println("Борец не очень");
    }
}
