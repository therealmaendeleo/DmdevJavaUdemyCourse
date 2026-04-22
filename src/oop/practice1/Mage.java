package oop.practice1;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(this, damage);
    }
}
