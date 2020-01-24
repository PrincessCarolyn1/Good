package com.academy.examples.lesson11;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:/temp/names.txt"));
        String row;
        while((row = reader.readLine())!= null) {
            System.out.println(row);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/temp/names4.txt"));
        writer.write("Kolya,Micha,Zhecka");
        writer.close();

        PrintWriter printWriter = new PrintWriter("D:/temp/names5.txt");
        printWriter.println("hello world!");
        printWriter.close();
    }
}
