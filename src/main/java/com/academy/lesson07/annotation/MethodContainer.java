package com.academy.lesson07.annotation;

public class MethodContainer {
    public void method1() {
        System.out.println("Method1");
    }

    @Run
    public void method2() {
        System.out.println("Method2");
    }

    @Run
    public void method3() {
        System.out.println("Method3");
    }

    @Run
    public void method4() {
        System.out.println("Method4");
    }
}
