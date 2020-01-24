package com.academy.lesson05.figure;

public class FigureTests {
    public static void main(String[] args) {
        testSquare();
        testCircle();
        testFigure();
    }

    private static void testFigure() {
//        Figure figure = new Figure("green");
//        System.out.println(figure);
    }

    private static void testCircle() {
        Circle circle = new Circle(5);
        double areaActual = circle.area();
        double areaExpected = Math.PI * 5 * 5;
        System.out.println(areaActual == areaExpected);
    }

    private static void testSquare() {
        Square square = new Square(5); // black
        Square square2 = new Square(5, "Orange");
        Square square3 = new Square(5, "Orange");
        square2.getColor(); // Этот метод берется из базового класса

        double sideActual = square.getSide();
        double sideExpected = 5;
        double areaActual = square.area();
        double areaExpected = 25;

        if (areaActual == areaExpected)
            System.out.println("Test passed");
        else
            System.out.println("Test error");

        square.setSide(6);
        square.draw();
        System.out.println(square);

        System.out.println(square.equals(square2));
        System.out.println(square2.equals(square3));
    }
}
