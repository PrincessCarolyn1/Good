package com.academy.examples.lesson07;

import com.academy.examples.lesson07.interfaces.IntFunction;

public class LambdaDemo2 {
    public static void main(String[] args) {
        calculate(4, 3, (n1, n2)->n1 + n2);
        calculate(4, 3, (n1, n2)->n1 - n2);
        calculate(4, 3, (n1, n2)->n1 * n2);
    }

    private static void calculate(int x1, int x2, IntFunction f) {
        int result = f.calc(x1, x2);
        System.out.println(result);
    }
}
