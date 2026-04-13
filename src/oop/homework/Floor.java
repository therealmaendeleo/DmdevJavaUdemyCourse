package oop.homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Floor {
    private int number;
    private Flat[] flats;

    public Floor(int number) {
        this.number = number;
        this.flats = IntStream.rangeClosed(1, 3)
            .mapToObj(Flat::new)
            .toArray(Flat[]::new);
    }

    public void print() {
        System.out.printf("Floor #%d (%d flats)\n", number, flats.length);
        Arrays.stream(flats).forEach(Flat::print);
    }
}
