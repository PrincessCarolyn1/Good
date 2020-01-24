package com.academy.examples.lesson09.generics;

public class GenDemo {
    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>();
        integerContainer.setValue(25);

        Container<String> stringContainer = new Container<>();
        stringContainer.setValue("string");

        Container<Object> objContainer = new Container<>();
        objContainer.setValue("obj");

        Container rawContainer = new Container();
        rawContainer.setValue("raw");

        consumeContainer1(integerContainer);
        // consumeContainer2(integerContainer);  ошибка компиляции
        consumeContainer3(integerContainer);

        consumeContainer1(stringContainer);
        // consumeContainer2(stringContainer); ошибка компиляции
        // consumeContainer3(stringContainer); ошибка компиляции

        consumeContainer1(objContainer);
        consumeContainer2(objContainer);
        // consumeContainer3(objContainer); ошибка компиляции

        consumeContainer1(rawContainer);
        consumeContainer2(rawContainer);
        consumeContainer3(rawContainer); // ошибка времени выполнения
    }

    private static void consumeContainer1(Container<?> container) {
        System.out.println(container.getValue());
    }

    private static void consumeContainer2(Container<? super Number> container) {
        System.out.println(container.getValue());
    }

    private static void consumeContainer3(Container<? extends Number> container) {
        System.out.println(container.getValue().intValue());
    }
}
