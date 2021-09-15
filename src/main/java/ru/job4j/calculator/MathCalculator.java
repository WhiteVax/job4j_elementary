package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

    public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivesion(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double rezultAllFunction(double first, double second) {
        return sum(first, second) + minus(first, second) + multiply(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы разности и деления равен: " + sumMinusAndDivesion(20, 30));
        System.out.println("Результат всех операций равен: " + rezultAllFunction(30, 40));
    }
}
