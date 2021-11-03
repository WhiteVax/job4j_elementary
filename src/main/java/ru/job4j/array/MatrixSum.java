package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        int i = 0;
        while (i < array.length) {
            for (int j = 0; j < array[i].length; j++) {
                rsl = rsl + array[i][j];
            }
            i++;
        }
        return rsl;
    }
}
