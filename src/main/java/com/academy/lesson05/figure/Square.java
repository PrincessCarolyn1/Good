package com.academy.lesson05.figure;

import java.util.Objects;

public class Square extends Figure {
    private double side;
    // private String color;

    public Square(double side) {
        // вызов конструктора базового класса 'Figure'
        // вызов должен быть первой инструкцией
        super("black");
        this.side = side;
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
//        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Square with side=%.2f, color=%s",
                side, color));
    }

    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square other = (Square)o;
        return this.side  == other.side && this.color.equalsIgnoreCase(other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
