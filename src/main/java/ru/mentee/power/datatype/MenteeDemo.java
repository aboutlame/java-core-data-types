package ru.mentee.power.datatype;

public class MenteeDemo {
    public static void main(String[] args) {
        Mentee Dima = new Mentee("Dima", "Timoshenko", 20, 5, 3);
        Mentee Stas = new Mentee("Stas", "Timoshenko", 20, 4.3, 4);
        Mentee Victor = new Mentee("Victor", "Gerasimov", 27, 3.9, 2);

        System.out.println("----------------------------");
        Dima.displayInfo();
        System.out.println("----------------------------");
        Stas.displayInfo();
        System.out.println("----------------------------");
        Victor.displayInfo();
        System.out.println("----------------------------");

        System.out.println("Dima got an excellent mark: " + Dima.isExcellent());
        System.out.println("Victor got an excellent mark: " + Victor.isExcellent());
        System.out.println("----------------------------");

        System.out.println("Increasing level for Dima: 3 -> 4");
        Dima.advanceToNextLevel();
        Dima.displayInfo();

    }
}
