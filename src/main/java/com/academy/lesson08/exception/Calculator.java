package com.academy.lesson08.exception;

public class Calculator {
    public double div(double x1, double x2) {
        return x1/x2;
    }

    public int div(int n1, int n2) throws DivisionByZero {
        if (n2 != 0)
            return n1/n2;
        else
            throw new DivisionByZero("Попытка поделить " + n1 + " на " + n2);
    }
}
