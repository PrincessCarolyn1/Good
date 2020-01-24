package com.academy.lesson02;

public class TypeDemo {
    public static void main(String[] args) {
        char ch = 'A' + 1;
        char ch2 = '\u02A5';
        System.out.println(ch2);

        int n = 100;
        long id = 3000000000L;

        // id = n;
        n = (int)id;

        System.out.println( n);
        System.out.println(2-1.1);

        int m = Integer.MAX_VALUE;
        System.out.println(m+1);

        // Операции
        int x = 10;
        x++; // x = x + 1; x += 1;
        System.out.println(x);

        int y = 10;
        System.out.println(y++);
//        System.out.println(++y);
        System.out.println(y);

       // Остаток от деления
        System.out.println("** Остаток от деления**");
        System.out.println(5 % 2);
        System.out.println(4 % 2);
        System.out.println(3 % 5);

        // Операторы сравнения/логические
        System.out.println("** Операторы сравнения/логические**");
        int k1 = 20;
        int k2 = 30;
        System.out.println(k1 == k2);
        System.out.println(k1 != k2);
        System.out.println(k1 > k2);
        System.out.println(k1 < k2);

        System.out.println("====");
        System.out.println(k1 > 1 && k1 < 30);
        System.out.println(k1 > 1 && k1 < 20);
        System.out.println(k1 > 1 || k1 < 20);
        System.out.println(k1 > 20 || k2 < 20);

        boolean isCorrectNumber = k1 > 20;
        System.out.println(!isCorrectNumber);

        String str1 = "1";
        String str2 = "2";
        System.out.println(str1 + str2);
        System.out.println(str1 == str2);

        int n1 = 20;
        int n2 = 5;
        int result = (++n1) + (n2--*3)-1;
        System.out.println(result);

        // Деление
        System.out.println("Деление");
        double z1 = 5;
        int z2 = 2;
        double div = z1/z2;
        double div2 = 5/2.0;
        System.out.println(div);
        System.out.println(div2);

        // упр
        System.out.println("1..9");
        for(int i = 1; i <= 9; i+=2) {
            System.out.println(i);
        }

        System.out.println("Сумма от 1 до 9");
        int sum = 0;
        for (int i = 1; i <= 9; i++)
            sum += i; //sum = sum + i;

        System.out.println(sum);

        // массивы
        System.out.println("Maссив");
        String[] words = {"A", "b", "bye", "!"};
        String[] strArrays = new String[10];
//        words[0] = "Hello";
//        words[1] = "World";
        System.out.println(words.length);
        System.out.println(words[2]);

        for (int i = 0; i < words.length; i++)
            if (words[i] != null)
                System.out.println(words[i]);

//        System.out.println(words[3]);
    } // main
} // class
