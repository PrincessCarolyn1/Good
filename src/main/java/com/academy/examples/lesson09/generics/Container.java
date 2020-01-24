package com.academy.examples.lesson09.generics;

public class Container<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
