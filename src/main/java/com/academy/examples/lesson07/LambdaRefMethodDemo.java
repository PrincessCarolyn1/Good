package com.academy.examples.lesson07;

import com.academy.examples.lesson07.impl.Arithmetic;
import com.academy.examples.lesson07.interfaces.IntFunction;
import com.academy.examples.lesson07.interfaces.StringFunction;

public class LambdaRefMethodDemo {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        print(arithmetic::add, 3, 4);
        print(Arithmetic::mult, 3, 4);
        print((s)->s.toUpperCase(), "hello World");
        print(String::toUpperCase, "hello");
    }

    private static void print(IntFunction f, int a, int b) {
        System.out.println(f.calc(a, b));
    }

    private static void print(StringFunction f, String msg) {
        System.out.println(f.convert(msg));
    }
}
