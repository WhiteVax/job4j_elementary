package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Массив ages равен: " + ages.length);
        System.out.println("Массив surnames равен: " + surnames.length);
        System.out.println("Массив prices равен: " + prices.length);
    }
}
