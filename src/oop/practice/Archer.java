package oop.practice;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " стрельнул из лука в " + enemy.getName());
        enemy.takeDamage(this, damage);
    }
}
