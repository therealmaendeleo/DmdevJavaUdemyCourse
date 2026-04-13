package oop;

public class ComputerRunner {
    static void main() {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
