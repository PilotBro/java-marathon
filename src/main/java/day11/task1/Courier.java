package day11.task1;

public class Courier implements Worker {
    private int salary;
    private int costPerDeliveredUnit = 100;
    private int personalBonus = 50000;
    private int bonusThresholdLimit = 10000;
    private int countOfDeliveredUnits;
    private boolean isPayed;
    private Warehouse warehouse;
    private static int countOfCouriers;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        countOfCouriers++;
    }

    public int getSalary() {
        return salary;
    }
    public boolean getIsPayed() {
        return isPayed;
    }

    public void doWork() {
        salary += costPerDeliveredUnit;
        warehouse.setCountDeliveredOrders(1);
        countOfDeliveredUnits++;
    }
    public boolean bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() == bonusThresholdLimit && countOfCouriers == 1) {
                salary += personalBonus;
                isPayed = true;
            } else if (countOfCouriers > 1 && countOfDeliveredUnits >= bonusThresholdLimit / countOfCouriers) {
                salary += personalBonus;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        return isPayed;
    }

    @Override
    public String toString() {
        return "Заработная плата сотрудника: " + salary +
                "Был ли выплачен бонус: " + isPayed;
    }
}
