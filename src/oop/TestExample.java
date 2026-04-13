package oop;

public class TestExample {
    static void main() {
        int value = 10;
        int[] values = {value, 100, 199, 250};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
