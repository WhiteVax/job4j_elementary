package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Массив ages равен: " + ages.length);
        System.out.println("Массив surnames равен: " + surnames.length);
        System.out.println("Массив prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Vladyslav";
        names[1] = "Dmitry";
        names[2] = "Sergey";
        names[3] = "Artemy";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
