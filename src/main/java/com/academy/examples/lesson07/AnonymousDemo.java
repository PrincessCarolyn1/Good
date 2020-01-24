package com.academy.examples.lesson07;

import com.academy.examples.lesson07.interfaces.IntFunction;

public class AnonymousDemo {
    public static void main(String[] args) {
        IntFunction function = new IntFunction() {

            @Override
            public int calc(int n1, int n2) {
                return n1 - n2;
            }
        };

        int result = function.calc(3, 2);
        System.out.println(result); // => 1
    }
}
