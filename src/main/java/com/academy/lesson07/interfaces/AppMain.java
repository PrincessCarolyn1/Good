package com.academy.lesson07.interfaces;

public class AppMain {
    public static void main(String[] args) {
        Component btn = new Button();
        btn.draw();
        if (btn instanceof Button)
            ((Button)btn).draw1();

        Component3D btn1 = new Button3D();
        btn1.draw();
        btn1.draw3D();
    }
}
