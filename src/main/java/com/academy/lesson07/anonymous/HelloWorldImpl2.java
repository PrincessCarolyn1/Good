package com.academy.lesson07.anonymous;

public class HelloWorldImpl2 implements HelloWorld {
    @Override
    public void say(String msg) {
        System.out.println("Привет мир " + msg + "!!!");
    }
}
