package com.academy.lesson11;

import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        // Прочитать из файла 10 имен
        String inPath = "D:/temp/женские имена.txt";
        String outPath = "D:/temp/женские имена stream.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        br.lines() // возвращает stream
                .limit(10)
                .peek(pw::println)
                .forEach(System.out::println);

        br.close();
        pw.close();
    }
}
