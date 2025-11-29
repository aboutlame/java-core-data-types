package ru.mentee.power;

import java.util.Scanner;

public class CurrencyConverter {
    public static final double USD = 90.50;
    public static final double EUR = 98.20;
    public static final double CNY = 12.50;

    public static void main(String[] args) {
        System.out.println("Choose the currency: USD/EUR/CNY - ");
        String currency = new Scanner(System.in).nextLine();
        switch (currency){
            case "USD":
                System.out.println("100 USD -> " + USD * 100);
                break;
            case "EUR":
                System.out.println("100 EUR -> " + EUR * 100);
                break;
            case "CNY":
                System.out.println("100 CNY -> " + CNY * 100);
                break;
            default:
                System.out.println("You picked the wrong one.");
        }

        System.out.println((0.1 + 0.2) == 0.3 ? "YES" : "NO");
    }
}