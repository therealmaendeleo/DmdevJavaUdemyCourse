package string;

import java.util.Arrays;

/**
 * 1. Удалить из переданной строки все повторяющиеся символы
 * без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * (результат привести к верхнему регистру).
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 * <p>
 * 2. Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки.
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Homework {
    static void main() {
        String test1 = "abc Cpddd Dio OsfWw";
        System.out.println("Result 1: " + removeDuplicatedSymbols(test1));

        String test2 = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] result2 = getDigits(test2);
        System.out.printf("Result 2: %s (sum is %d)\n", Arrays.toString(result2), getSum(result2));
    }

    public static String removeDuplicatedSymbols(String value) {
        StringBuilder result = new StringBuilder();
        char lastAddedChar = ' ';
        for (char ch : value.toUpperCase().toCharArray()) {
            if (ch != lastAddedChar && ch != ' ') {
                result.append(ch);
                lastAddedChar = ch;
            }
        }
        return result.toString();
    }

    public static int[] getDigits(String value) {
        StringBuilder digitsString = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                digitsString.append(value.charAt(i));
            }
        }
        int[] digits = new int[digitsString.length()];
        for (int i = 0; i < digitsString.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(digitsString.charAt(i)));
        }
        return digits;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int digit : array) {
            sum += digit;
        }
        return sum;
    }
}
