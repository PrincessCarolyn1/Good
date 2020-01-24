package com.academy.examples.lesson07.impl;

import com.academy.examples.lesson07.interfaces.IntFunction;

public class IntFunctionImpl implements IntFunction {

    @Override
    public int calc(int n1, int n2) {
        return n1 + n2;
    }
}
