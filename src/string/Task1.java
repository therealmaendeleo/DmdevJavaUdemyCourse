package string;

/**
 * Заменить все грустные смайлы :( в строке на веселые :)
 */

public class Task1 {
    static void main() {
        String value = "sdlfikjsa :(0 :):) Ksdf:(:)dsf: (";
        String result = replaceSad(value);
        System.out.println(result);
    }

    public static String replaceSad(String value) {
        return value.replace(":(", ":)");
    }
}
