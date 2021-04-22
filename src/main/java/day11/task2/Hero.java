package day11.task2;

public abstract class Hero implements PhysAttack {
    private static final int MAX_HEALTH = 100;

    private int health = 100;
    private double physDef;
    private double magicDef;
    private int physAtt;

    @Override
    public void physicalAttack(Hero hero) {
        int heroHealthValue = hero.getHealth() - (physAtt - (int)(physAtt * hero.physDef));
        if (heroHealthValue < 0) {
            hero.setHealth(0);
            System.out.println("The Hero is eaten by hyenas.");
        } else {
            hero.setHealth(heroHealthValue);
        }
        System.out.println(hero.toString());
    }

    public double getPhysDef() {
        return physDef;
    }
    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }
    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public static int getMaxHealth() {
        return MAX_HEALTH;
    }
}
