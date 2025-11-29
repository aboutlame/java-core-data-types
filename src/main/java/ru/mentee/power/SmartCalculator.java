package ru.mentee.power;

public class SmartCalculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        System.out.println("Сложение целых чисел: " + a + " + " + b + " = " + (a + b));

        int x = 5;
        double y = 3.2;
        System.out.println("Умножение int на double: " + x + " * " + y + " = " + (x * y) + " (double)");

        int d1 = 10;
        int d2 = 4;
        double d3 = (double) d1 / d2;
        System.out.println("Деление с правильным выбором типа: " + d1 + " / " + d2 + " = " + d3+ " (double)");

        int n1 = 100;
        int n2 = 0;
        if (n2 == 0) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        } else {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        }

        double powResult = Math.pow(2, 10);
        System.out.println("Возведение в степень: " + "2^10 = " + powResult);

        // 5. Пример смешанных операций — int + long → long
        int small = 10;
        long big = 5000000000L;
        System.out.println("Смешанные операции типов: " + small + " + " + big + " = " + (small + big) + " (long)");

        // 6. Работа с float и double
        float f1 = 1.5f;
        double d4 = 2.75;
        System.out.println("float + double: " + f1 + " + " + d4 + " = " + (f1 + d4) + " (double)");
    }
}