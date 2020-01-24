package com.academy.lesson06;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setGender(Gender.MALE);
        person.doCommonJob("очистить лес");

        ItSpecialist itSpecialist = new ItSpecialist();
        itSpecialist.doTest();

        Person person1 = new ItSpecialist();
        person1.doCommonJob("уборку леса");

        Wrestler person2 = new Wrestler();
        person2.doCommonJob("Рублю дрова");
        person2.fight();

        Person[] persons = new Person[5];
        persons[0] = new Person();
        persons[1] = new ItSpecialist();
        persons[2] = new Wrestler();
        persons[3] = new ItSpecialist();
        persons[4] = new Musician();

        System.out.println("****");
        for (int i = 0; i < persons.length; i++) {
//            persons[i].doCommonJob("помой посуду");
            persons[i].about();
        }

        System.out.println("----");
        if (persons[2] instanceof ItSpecialist)
            ((ItSpecialist)persons[2]).doTest();
        else if (persons[2] instanceof Wrestler)
            ((Wrestler)persons[2]).fight();
        else
            persons[2].doCommonJob("Убирай");
    }
}
