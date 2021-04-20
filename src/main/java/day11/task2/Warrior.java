package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        setPhysAtt(30);
        setPhysDef(0.8);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
