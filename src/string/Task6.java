package string;

public class Task6 {
    static void main() {
        long startTime = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Time: %dms\n", (endTime - startTime));

        String s = "";
        System.out.println(s + 4);
    }
}
