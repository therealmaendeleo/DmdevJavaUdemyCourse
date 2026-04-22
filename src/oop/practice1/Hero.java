package oop.practice1;

public abstract class Hero implements Mortal {
    protected String name;
    protected int damage;
    protected int health = 100;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= Math.min(damage, health);
        if (health > 0) {
            System.out.printf("%s получил урон %d (осталось %d)\n", name, damage, health);
        } else {
            System.out.println(name + " погиб в бою");
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    public void setHealth(int health) {
        this.health = health;
    }
}
