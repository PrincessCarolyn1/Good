package com.academy.lesson09.generic;

public class PairGenExt<T, S extends Number> {
    private T value1;
    private S value2;

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public S getValue2() {
        return value2;
    }

    public void setValue2(S value2) {
        this.value2 = value2;
    }
}
