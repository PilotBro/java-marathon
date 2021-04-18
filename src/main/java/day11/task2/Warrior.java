package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        health = 100;
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0.0;
    }

    @Override
    public int physicalAttack(Hero hero) {
        if (hero.health > 0) {
            hero.health = hero.health - (int) (physAtt - (physAtt * hero.physDef));
            if (hero.health < 0) {
                hero.health = 0;
            }
        } else if (hero.health < 0){
            hero.health = 0;
        }
        System.out.println(hero.toString());
        return hero.health;
    }
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
