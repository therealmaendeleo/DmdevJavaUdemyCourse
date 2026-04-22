package oop.practice;

public class TrainingGround {
    static void main() {
        Hero warrior = new Warrior("Боромир", 25);
        Hero mage = new Mage("Гэндольф", 30);
        Hero archer = new Archer("Леголас", 15);

        Enemy voldemort = new Enemy("Волан-де-Морт", 70);
        attackEnemy(voldemort, warrior, mage, archer);

        Zombie zombie = new Zombie("Чак", 20);
        attackEnemy(zombie, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        int heroIndex = 0;
        while (enemy.isAlive()) {
            if (!heroes[heroIndex].isAlive()) {
                if (heroIndex < heroes.length - 1) {
                    heroIndex++;
                    continue;
                }
                break;
            }
            heroes[heroIndex].attackEnemy(enemy);
        }
    }
}
