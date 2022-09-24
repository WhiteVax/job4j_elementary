package ru.job4j.array;

public class JavaNameValidator {
        public static boolean isNameValid(String name) {
            char[] chars = name.toCharArray();
            var isSpecial = false;
            var isUpper = false;
            var isLower = false;
            if (chars.length != 0) {
                isLower = isLowerLatinLetter(chars[0]);
                for (var el : chars) {
                    isUpper = isUpperLatinLetter(el);
                    isSpecial = isSpecialSymbol(el);
                }
            }
            return isLower || isUpper || isSpecial;
        }

        public static boolean isSpecialSymbol(int code) {
            return code == 35 || code == 95;
        }

        public static boolean isUpperLatinLetter(int code) {
            return code >= 65 && code <= 95;
        }

        public static boolean isLowerLatinLetter(int code) {
            return code >= 97 && code <= 122;
        }
}
