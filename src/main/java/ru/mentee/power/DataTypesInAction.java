package ru.mentee.power;

public class DataTypesInAction {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        double c = 2.5;
        byte d = 100;
        byte e = 95;
        boolean aa = true;
        boolean bb = false;
        char cc = 65;

        System.out.println("Целочисленное деление: " + "12 / 5 = " + (a / b));
        System.out.println("Деление с плавающей точкой: " + "12 / 2.5 = " + (a / c));
        System.out.println("Явное приведение типов: " + "2.5 -> " + (int)c);
        System.out.println("Автоматическое повышение типа: " + "100 (byte) + 95 (byte) == " + (d + e) + " (int)");
        System.out.println("Операции с boolean: " + "true || false = " + (aa || bb));
        System.out.println("Работа с символами: " + "a = " + cc);


    }
}
