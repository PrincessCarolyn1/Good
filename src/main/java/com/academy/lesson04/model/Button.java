package com.academy.lesson04.model;

public class Button {
    public static final int DEFAULT_HEIGHT = 10;

    private String text;
    private String color;
    private int height;

    public Button() {
    }

    public Button(String text) {
        this.text = text;
    }

    public Button(String text, String color, int height) {
//        this.text = text;
        this(text); // вызываем конструктор текущего класса
        this.color = color;
        this.height = height;

    }

    public void setHeight(int value) {
        if (value > 0) {
            System.out.println(String.format(
                    "Warning: value %s should be positive", value));
            height = value;
        }
    }

    public int getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printHelp() {
        System.out.println("How to use buttons");
    }
}
