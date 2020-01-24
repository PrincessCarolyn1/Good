package com.academy.lesson04;

import com.academy.lesson04.model.Button;

public class ButtonDemo {
    public static void main(String[] args) {
        Button button0 = new Button();
        Button button1 = new Button("Login");
        Button button2 = new Button("Login", "Blue", 34);
//        button1.setText("Login");
        button1.setColor("Red");
        button1.setHeight(25);
        button1.setHeight(-100);
//        button1.setHeight(10);
        //button1.height += 5;
        System.out.println(button1.getText());
        System.out.println(button1.getColor());
        System.out.println(button1.getHeight());

        System.out.println(button2.getColor());

        // Static
//        Button button3 = new Button();
        System.out.println(Button.DEFAULT_HEIGHT);
        Button.printHelp();

        Character ch = 'a';
        ch.toString();
        Character.toLowerCase('b');
    }
}
