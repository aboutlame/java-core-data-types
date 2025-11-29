package ru.mentee.power;

public class TypePuzzle {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 ? " + (a == 0.3));

        System.out.println("Как исправить:");
        System.out.println("Сравнивать через эпсилон: |a - b| < 1e-9");
        boolean eps = Math.abs(a - 0.3) < 1e-9;
        System.out.println("Исправленный результат: " + eps + "\n");

        int max = Integer.MAX_VALUE;
        int overflow = max + 1;
        System.out.println("Переполнение int");
        System.out.println("MAX_INT = " + max);
        System.out.println("MAX_INT + 1 = " + overflow);
        System.out.println("Как исправить: использовать long или проверку перед операцией.");
        long safe = (long) max + 1;
        System.out.println("Исправленный вариант (long): " + safe + "\n");

        Integer obj = null;
        System.out.println("Автораспаковка null: ");
        try {
            int value = obj; // здесь произойдёт NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Упала ошибка: " + e);
        }
        System.out.println("Как исправить: проверять на null\n");

        byte b1 = 5;
        byte b2 = 7;
        // byte b3 = b1 + b2;  // Ошибка! Результат — int
        int mixed = b1 + b2;

        System.out.println("byte + byte → int");
        System.out.println("Результат вычисления: " + mixed + " (int)");
        byte fixed = (byte) (b1 + b2);
        System.out.println("Исправление (явное приведение): " + fixed + " (byte)" + "\n");

        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = 200;
        Integer n4 = 200;

        System.out.println("Сравнение Integer с кешированием");
        System.out.println("100 == 100 ? " + (n1 == n2));
        System.out.println("200 == 200 ? " + (n3 == n4));
        System.out.println("Правильно сравнивать: n1.equals(n2)\n");

        System.out.println("Смешанные выражения со строками");
        System.out.println(1 + 2 + "3");
        System.out.println("1" + 2 + 3);
        System.out.println("Как исправить: использовать скобки или String.format.\n");
    }
}