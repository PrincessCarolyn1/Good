package com.academy.examples.lesson03;

public class StringDemo {
    public static void main(String[] args) {
        // Создание
        String firstName = "Peter";
        String lastName = "Ivanov";

        // Конкатенация
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // => Peter Ivanov

        // Форматирование
        String profile = String.format("First name %s, last %s, age %d",
                firstName, lastName, 25);

        System.out.println(profile); // => First name Peter, last Ivanov, age 25

        // методы
        String emptyStr = "";
        String str = "Hello World!";
        System.out.println(str.contains("ell")); //=> true
        System.out.println(str.length()); //=> 12
        System.out.println(str.compareTo("Bye")); //=> 6

        System.out.println(str.toLowerCase()); //=> "hello world!"
        System.out.println(str.toUpperCase()); //=> "HELLO WORLD!"

        char ch1 = str.charAt(0); // => 'H'
        char ch2 = str.charAt(1); // => 'e'
        char chLast = str.charAt(str.length()-1); // => '!'

        System.out.println(str.substring(6)); // => "World!"
        System.out.println(str.substring(0, 5)); // => "Hello"

        System.out.println(str.isEmpty());      // => false
        System.out.println(emptyStr.isEmpty()); // => true

        System.out.println(str.startsWith("Hell")); // => true
        System.out.println(str.startsWith("ell", 1)); // => true
        System.out.println(str.endsWith("rld!")); // => true

        String str2 = "  Hello World! ";
        System.out.println(str2.trim()); // => "Hello World!"

        System.out.println(str.equalsIgnoreCase("heLLo woRlD!")); // => true
        System.out.println(str.indexOf("o")); // => 4
        System.out.println(str.indexOf("o", 5)); // => 7

        System.out.println(str.lastIndexOf("orl")); // => 7
        System.out.println(str.replace("Hello", "Bye")); // => Bye World!
        System.out.println(str.replaceAll("l", "л")); // => "Heллo Worлd!"
        String[] words = str.split(" "); // => ["Hello", "World!"]
        char chars[] = str.toCharArray(); // => ['H', 'e', 'l', 'l', 'o', ' ',...]
        System.out.println(str.repeat(2)); // =>  Hello World!Hello World!
    }
}
