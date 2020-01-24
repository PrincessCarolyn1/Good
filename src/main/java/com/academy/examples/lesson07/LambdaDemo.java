package com.academy.examples.lesson07;

import com.academy.examples.lesson07.interfaces.IntFunction;

public class LambdaDemo {
    public static void main(String[] args) {
        IntFunction function = (n1, n2) -> n1 * n2;

        int result = function.calc(2, 3);
        System.out.println(result); // => 6
    }
}
