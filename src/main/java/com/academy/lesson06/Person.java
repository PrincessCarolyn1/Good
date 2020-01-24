package com.academy.lesson06;

public class Person implements Comparable<Person> {
    protected long id;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected int age;

    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Person(long id, String firstName, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.gender = gender;
    }

    public void doCommonJob(String typeOfJob) {
        System.out.println("Я делаю " + typeOfJob);
    }

    public void about() {
        System.out.println("Я человек");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        if (this.id < other.id)
            return -1;

        if (this.id > other.id)
            return 1;

        return 0;
    }
}
