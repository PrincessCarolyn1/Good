package com.academy.examples.lesson03;

public class CharacterDemo {
    public static void main(String[] args) {
        // Статические методы
        System.out.println(Character.compare('a', 'b')); // => -1
        System.out.println(Character.compare('a', 'a')); // => 0
        System.out.println(Character.compare('b', 'a')); // => 1

        String letter = Character.toString('A');          // => "A"
        String letter2 = Character.toString(65);   // => "A"
        System.out.println(Character.getName(65)); // => LATIN CAPITAL LETTER A

        System.out.println(Character.isDigit('2')); // => true
        System.out.println(Character.isDigit('a')); // => false

        System.out.println(Character.isDigit(53)); // => true
        System.out.println(Character.isDigit(65)); // => false

        System.out.println(Character.isAlphabetic(53)); // => false
        System.out.println(Character.isAlphabetic(65)); // => true

        System.out.println(Character.isLetter('2'));        // => false
        System.out.println(Character.isLetter('a'));        // => true
        System.out.println(Character.isLetterOrDigit('2')); // => true

        System.out.println(Character.isLowerCase('a'));  // => true
        System.out.println(Character.isLowerCase('A'));  // => false
        System.out.println(Character.isUpperCase('a'));  // => false
        System.out.println(Character.isUpperCase('A'));  // => true

        System.out.println(Character.isSpaceChar(' ')); // => true
        System.out.println(Character.isSpaceChar('_')); // => false

        System.out.println(Character.toLowerCase('A')); // => 'a'
        System.out.println(Character.toUpperCase('a')); // => 'A'

        // Методы экземпляра
        Character ch = 'B'; // =>
        Character ch2 = 66; // =>

        System.out.println(ch.compareTo('A')); // => 1
        System.out.println(ch.compareTo('B')); // => 0
        System.out.println(ch.compareTo('C')); // => -1

        String str = ch.toString();
        char c = ch.charValue();
        System.out.println(ch.equals('B')); // => true
    }
}
