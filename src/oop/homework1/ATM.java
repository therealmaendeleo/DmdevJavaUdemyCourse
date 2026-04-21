package oop.homework1;

public class ATM {
    private int hundreds;
    private int fifties;
    private int twenties;

    public ATM(int hundreds, int fifties, int twenties) {
        this.hundreds = hundreds;
        this.fifties = fifties;
        this.twenties = twenties;
    }

    public boolean withdraw(int moneyAmount) {
        if (100 * hundreds + 50 * fifties + 20 * twenties < moneyAmount) {
            return false;
        }
        if (moneyAmount < 20 || moneyAmount % 10 != 0) {
            return false;
        }
        for (int h = Math.min(hundreds, moneyAmount / 100); h >= 0; h--) {
            int remainingAmount = moneyAmount - h * 100;
            for (int f = Math.min(fifties, remainingAmount / 50); f >= 0; f--) {
                int finalAmount = remainingAmount - f * 50;
                if (finalAmount % 20 == 0 && twenties * 20 >= finalAmount) {
                    hundreds -= h;
                    fifties -= f;
                    twenties -= finalAmount / 20;
                    System.out.printf("Withdrawed $100 (%d pcs), $50 (%d pcs), $20 (%d pcs)\n",
                        h, f, finalAmount / 20);
                    return true;
                }
            }
        }
        return false;
    }

    public void addTwenties(int banknotesAmount) {
        if (banknotesAmount > 0) {
            twenties += banknotesAmount;
        }
    }

    public void addFifties(int banknotesAmount) {
        if (banknotesAmount > 0) {
            fifties += banknotesAmount;
        }
    }

    public void addHundreds(int banknotesAmount) {
        if (banknotesAmount > 0) {
            hundreds += banknotesAmount;
        }
    }
}
