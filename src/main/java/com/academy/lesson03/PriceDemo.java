package com.academy.lesson03;

public class PriceDemo {
    public static void main(String[] args) {
        String[] priceRaw = {"4 418?грн", "43 418?грн", "43 418?$"};
        int[] expected = {4418, 43418, 43418};

        for (int i = 0; i < priceRaw.length; i++) {
            String replaced = preparePriceRegex(priceRaw[i]);
            int actual = Integer.parseInt(replaced);
            System.out.println(expected[i] == actual);
        }
    }

    public static String preparePrice(String priceRaw) {
        return priceRaw
                .replace(" ", "")
                .replace("?грн", "")
                .replace("?$", "");
    }

    public static String preparePriceRegex(String priceRaw) {
        return priceRaw.replaceAll("[^\\d]","");
    }
}
