package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static int COST_PER_DELIVERED_UNIT = 80;
    private static int PERSONAL_BONUS = 70000;
    private static int BONUS_THRESHOLD_UNIT = 10000;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary(){
        return salary;
    }
    public boolean getIsPayed() {
        return isPayed;
    }

    public void doWork() {
        salary += COST_PER_DELIVERED_UNIT;
        warehouse.incrementCountPickedOrders();
    }
    public void bonus() {
        if (warehouse.getCountPickedOrders() < BONUS_THRESHOLD_UNIT) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (!isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += PERSONAL_BONUS;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Заработная плата сотрудника: " + salary + System.lineSeparator() +
                "Был ли выплачен бонус: " + isPayed;
    }
}
