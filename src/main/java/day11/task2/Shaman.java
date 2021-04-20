package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    private static final int HEAL_HIMSELF_AMOUNT = 50;
    private static final int HEAL_TEAMMATE = 30;

    private int magicAtt = 15;

    public Shaman() {
        setPhysAtt(10);
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - (int)(magicAtt * hero.getMagicDef())));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
            System.out.println("The Hero is eaten by hyenas.");
        }
        System.out.println(hero.toString());
    }
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF_AMOUNT);
        if (getHealth() > getMaxHealth()) {
            setHealth(getMaxHealth());
        }
        System.out.println(toString());
    }
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + HEAL_TEAMMATE);
        if (hero.getHealth() > getMaxHealth()) {
            hero.setHealth(getMaxHealth());
        }
        System.out.println(hero.toString());
    }

    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
