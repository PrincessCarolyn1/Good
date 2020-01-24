package com.academy.lesson07.anonymous;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void say(String msg) {
        System.out.println("Hello world " + msg);
    }
}
