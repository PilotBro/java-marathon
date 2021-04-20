package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private static final int HEAL_HIMSELF_AMOUNT = 25;
    private static final int HEAL_TEAMMATE = 10;

    public Paladin() {
        setPhysAtt(15);
        setPhysDef(0.5);
        setMagicDef(0.2);

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
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
