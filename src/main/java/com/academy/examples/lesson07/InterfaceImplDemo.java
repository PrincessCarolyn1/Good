package com.academy.examples.lesson07;

import com.academy.examples.lesson07.impl.IntFunctionImpl;
import com.academy.examples.lesson07.interfaces.IntFunction;

public class InterfaceImplDemo {
    public static void main(String[] args) {
        IntFunction function = new IntFunctionImpl();
        int result = function.calc(2, 3);
        System.out.println(result); // => 5
    }
}
