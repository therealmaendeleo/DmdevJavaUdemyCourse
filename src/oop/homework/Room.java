package oop.homework;

public class Room {
    private int number;
    private boolean isPassing;

    public Room(int number) {
        this.number = number;
    }

    public Room(int number, boolean isPassing) {
        this.number = number;
        this.isPassing = isPassing;
    }

    public void print() {
        String passString = isPassing ? "passing" : "not passing";
        System.out.printf("Room #%d (%s)\n", number, passString);
    }
}
