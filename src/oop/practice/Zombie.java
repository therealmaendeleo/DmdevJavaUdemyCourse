package oop.practice;

public class Zombie extends Enemy {
    private int rebornHealth;
    private boolean isReborned;

    public Zombie(String name, int reverseDamage) {
        super(name, reverseDamage);
        rebornHealth = 30;
        isReborned = false;
    }

    @Override
    public void takeDamage(Hero hero, int damage) {
        health -= Math.min(health, damage);
        System.out.printf("Зомби %s получил урон %d (осталось %d)\n", name, damage, health);
        if (isAlive()) {
            reverseAttack(hero);
        } else if (!isReborned) {
            health += rebornHealth;
            isReborned = true;
            System.out.printf("Зомби %s возродился (%d hp) \n", name, rebornHealth);
        } else {
            System.out.println(name + " повержен!");
        }
    }
}
