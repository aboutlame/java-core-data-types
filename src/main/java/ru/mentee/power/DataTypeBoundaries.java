package ru.mentee.power;

public class DataTypeBoundaries {
    public static void main(String[] args) {
        // TODO: Выведите минимальные и максимальные значения для всех числовых типов данных
        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);

        // TODO: Продемонстрируйте переполнение для одного из типов
        System.out.println("Максимальный int + 1 = " + (Integer.MAX_VALUE + 1));
    }
}
