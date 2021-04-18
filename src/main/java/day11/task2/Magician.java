package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        health = 100;
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
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
    public int magicalAttack(Hero hero) {
        if (hero.health > 0) {
            hero.health = hero.health - (int) (magicAtt - (magicAtt * hero.magicDef));
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
