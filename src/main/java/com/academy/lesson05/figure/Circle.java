package com.academy.lesson05.figure;

import java.util.Objects;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        super("black");
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println(String.format("Circle with radius=%d, color=%s", radius, color));

    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, radius);
    }
}
