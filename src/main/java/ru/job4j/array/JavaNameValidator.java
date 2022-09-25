package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        var rsl = true;
        if (name.isEmpty() || !isLowerLatinLetter(name.charAt(0))) {
            return false;
        }

        for (int i = 1; i < name.length(); i++) {
            var in = name.codePointAt(i);
            if (!(isLowerLatinLetter(in) || isUpperLatinLetter(in)
                    || isSpecialSymbol(in) || Character.isDigit(in))) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
