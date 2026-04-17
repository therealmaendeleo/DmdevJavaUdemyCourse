package string;

/**
 * Определить, является ли строка палиндромом
 */

public class PalindromeTask {
    static void main() {
        String value = "манекенамм";
        String resultString = isPalindrome(value) ? "" : " не";
        System.out.printf("Строка \"%s\" -%s палиндром", value, resultString);
    }

    public static boolean isPalindrome(String value) {
        int length = value.length();
        for (int i = 0; i < length / 2; i++) {
            if (value.charAt(i) != value.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
