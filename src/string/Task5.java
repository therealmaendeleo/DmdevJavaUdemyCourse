package string;

import java.util.Arrays;

/**
 * Написать функцию, разбивающую строку на равные части
 * по <b>n</b> символов и сохраняющую отдельные части в массив.
 * Вывести этот массив
 */

public class Task5 {
    static void main() {
        String value = "1234567890";
        int n = 3;
        System.out.println(Arrays.toString(split(value, n)));
    }

    public static String[] split(String value, int n) {
        String[] arrayOfSubstrings = new String[Math.ceilDiv(value.length(), n)];
        int endIndex;
        for (int i = 0; i < value.length(); i += n) {
            endIndex = Math.min(value.length(), i + n);
            arrayOfSubstrings[i / n] = value.substring(i, endIndex);
        }
        return arrayOfSubstrings;
    }
}
