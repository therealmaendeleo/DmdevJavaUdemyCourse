package oop.practice;

public class Enemy implements Mortal {
    protected String name;
    protected int health = 100;
    protected int reverseDamage;

    public Enemy(String name, int reverseDamage) {
        this.name = name;
        this.reverseDamage = reverseDamage;
    }

    public void reverseAttack(Hero hero) {
        hero.takeDamage(reverseDamage);
    }

    public void takeDamage(Hero hero, int damage) {
        health -= Math.min(health, damage);
        if (isAlive()) {
            System.out.printf("%s получил урон %d (осталось %d)\n", name, damage, health);
            reverseAttack(hero);
        } else {
            System.out.println(name + " повержен!");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
