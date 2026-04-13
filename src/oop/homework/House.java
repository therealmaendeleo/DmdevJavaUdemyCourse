package oop.homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class House {
    private int number;
    private Floor[] floors;

    public House(int number) {
        this.number = number;
        this.floors = IntStream.rangeClosed(1, 5)
            .mapToObj(Floor::new)
            .toArray(Floor[]::new);
    }

    public void print() {
        System.out.printf("House #%d (%d floors)\n", number, floors.length);
        Arrays.stream(floors).forEach(Floor::print);
    }
}
