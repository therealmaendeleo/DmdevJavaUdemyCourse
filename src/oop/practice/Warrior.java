package oop.practice;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(this, damage);
    }
}
