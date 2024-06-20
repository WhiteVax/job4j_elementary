package ru.job4j.converter;

public class Converter {

    private static final float EURO_CONVERSION_RATE = 70.0f;
    private static final float DOLLAR_CONVERSION_RATE = 60.0f;

    public static float rubleToEuro(float value) {
        return value / EURO_CONVERSION_RATE;
    }

    public static float rubleToDollar(float value) {
        return value / DOLLAR_CONVERSION_RATE;
    }

    public static void main(String[] args) {
        float rubles = 140;

        float euro = Converter.rubleToEuro(rubles);
        System.out.printf("%.0f rubles are %.2f euro.%n", rubles, euro);

        float dollars = Converter.rubleToDollar(rubles);
        System.out.printf("%.0f rubles are %.2f dollars.%n", rubles, dollars);

        float in = 140;

        float expectedEuro = 2.0f;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = Math.abs(expectedEuro - outEuro) < 0.01;
        System.out.printf("140 rubles are %.2f euro. Test result: %b%n", expectedEuro, passedEuro);

        float expectedDollar = 2.33f;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = Math.abs(expectedDollar - outDollar) < 0.01;
        System.out.printf("140 rubles are %.2f dollars. Test result: %b%n", expectedDollar, passedDollar);
    }
}
