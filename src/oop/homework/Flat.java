package oop.homework;

import java.util.Arrays;
import java.util.Random;

public class Flat {
    private int number;
    private Room[] rooms;

    public static final int MAX_ROOMS = 3;

    public Flat(int number) {
        this.number = number;
        Random rand = new Random();
        int roomsCount = rand.nextInt(MAX_ROOMS) + 1;
        this.rooms = rand.ints(roomsCount, 1, roomsCount + 1)
            .mapToObj(n -> new Room(n, rand.nextBoolean()))
            .toArray(Room[]::new);
    }

    public void print() {
        System.out.printf("Flat #%d (%d rooms)\n", number, rooms.length);
        Arrays.stream(rooms).forEach(Room::print);
    }
}
