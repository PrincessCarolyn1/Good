package com.academy.lesson03.exc;

public class StringExc {
    public static void main(String[] args) {
        String str1 = "abcd";
        String reversed1 = reverse1(str1);
        String reversed2 = reverse2(str1);
        String reversed3 = reverse3(str1);
        String reversed4 = reverse4(str1);
        StringBuffer sb = new StringBuffer(str1);
        String reversed5 = sb.reverse().toString();
        System.out.println(reversed1);
        System.out.println(reversed2);
        System.out.println(reversed3);
        System.out.println(reversed4);
        System.out.println(reversed5);
        System.out.println(reversed1.equals("dcba"));

        String palindrom = "abcdcba";
        String tmp = reverse1(palindrom);
        if (palindrom.equals(tmp))
            System.out.println("Палиндром");
    }

    private static String reverse4(String str1) {
        StringBuffer sb = new StringBuffer();
        for (int i = str1.length() - 1; i >= 0; i--) {
            sb.append(str1.charAt(i));
        }

        return sb.toString();
    }


    private static String reverse3(String str1) {
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        return reversed;
    }

    private static String reverse1(String str1) {
        char[] tmp = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            tmp[i] = str1.charAt(str1.length()-1 - i);
        }

//        tmp[0] = str1.charAt(str1.length()-1 - 0);
//        tmp[1] = str1.charAt(str1.length()-1 - 1);
//        tmp[2] = str1.charAt(str1.length()-1 - 2);
//        tmp[3] = str1.charAt(str1.length()-1 - 3);

        String reversed = new String(tmp);
        return reversed;
    }

    private static String reverse2(String str1) {
        char[] tmp = new char[str1.length()];

        for (int i = 0, j = str1.length()-1; i < str1.length(); i++, j--) {
            tmp[i] = str1.charAt(j);
        }

        String reversed = new String(tmp);
        return reversed;
    }
}
