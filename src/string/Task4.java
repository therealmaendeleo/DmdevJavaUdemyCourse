package string;

/**
 * Подсчитать количество всех точек, запятых
 * и восклицательных знаков в строке (без регулярок)
 */

public class Task4 {
    static void main() {
        String value = "asdf.,!asdf.,?sdfgew!sdfa";
        System.out.println("Amount of punctuation marks (.,!): " + countPunctuationMarks(value));
    }

    public static int countPunctuationMarks(String value) {
        String replacedString = value
            .replace(".", "")
            .replace(",", "")
            .replace("!", "");
        return value.length() - replacedString.length();
    }
}
