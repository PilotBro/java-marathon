package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int magicAtt = 20;

    public Magician() {
        setPhysDef(0);
        setPhysAtt(5);
        setMagicDef(0.8);
    }

    public void magicalAttack(Hero hero) {
        int heroHealthValue = hero.getHealth() - (magicAtt - (int)(magicAtt * hero.getMagicDef()));
        if (heroHealthValue < 0) {
            hero.setHealth(0);
            System.out.println("The Hero is eaten by hyenas.");
        } else {
            hero.setHealth(heroHealthValue);
        }
        System.out.println(hero.toString());
    }
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
