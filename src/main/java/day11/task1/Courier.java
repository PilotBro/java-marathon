package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int COST_PER_DELIVERED_UNIT = 100;
    private static final int PERSONAL_BONUS = 50000;
    private static final int BONUS_THRESHOLD_UNIT = 10000;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }
    public boolean getIsPayed() {
        return isPayed;
    }

    public void doWork() {
        salary += COST_PER_DELIVERED_UNIT;
        warehouse.incrementCountDeliveredOrders();
    }
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < BONUS_THRESHOLD_UNIT) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
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
