package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        health = 100;
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
        healHimself = 25;
        healTeammate = 10;
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
    public int healHimself() {
        if (health != 100) {
            health += healHimself;
            if (health > 100) {
                health = 100;
            }
        }
        System.out.println(toString());
        return health;
    }
    public int healTeammate(Hero hero) {
        if (hero.health != 100) {
            hero.health += healTeammate;
            if (hero.health > 100) {
                hero.health = 100;
            }
        }
        System.out.println(hero.toString());
        return hero.health;
    }
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
