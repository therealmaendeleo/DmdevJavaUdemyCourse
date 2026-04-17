package string;

import java.util.Arrays;

/**
 * Написать программу, преобразующую строку, содержащую число
 * в римском формате, в число в арабском формате.
 * Например CM == 900.
 * Границы чисел: от 1 до 3999
 */

public class RomanNumber {
    private RomanDigit[] digits;

    public RomanNumber(String romanNumberString) {
        this.digits = new RomanDigit[romanNumberString.length()];
        for (int i = 0; i < romanNumberString.length(); i++) {
            String currentLetter = String.valueOf(romanNumberString.charAt(i));
            this.digits[i] = RomanDigit.valueOf(currentLetter);
        }
    }

    public int getArabic() {
        int result = digits[digits.length - 1].arabicValue;
        for (int i = digits.length - 2; i >= 0; i--) {
            int previousArabic = digits[i + 1].arabicValue;
            if (digits[i].arabicValue < previousArabic) {
                result -= digits[i].arabicValue;
            } else {
                result += digits[i].arabicValue;
            }
        }
        return result;
    }

    static void main() {
        RomanNumber romanNumber = new RomanNumber("MCMLXXXVI");
        System.out.println(romanNumber.getArabic());
    }

    private enum RomanDigit {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1);

        private final int arabicValue;

        RomanDigit(int arabicDigit) {
            this.arabicValue = arabicDigit;
        }
    }
}
