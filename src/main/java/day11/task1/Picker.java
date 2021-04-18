package day11.task1;

public class Picker implements Worker {
    private int salary;
    private int costPerPickedUnit = 80;
    private int personalBonus = 70000;
    private int bonusThresholdLimit = 10000;
    private int countOfPickedUnits;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static int countOfPickers;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        countOfPickers++;
    }

    public int getSalary(){
        return salary;
    }
    public boolean getIsPayed() {
        return isPayed;
    }

    public void doWork() {
        salary += costPerPickedUnit;
        warehouse.setCountPickedOrders(1);
        countOfPickedUnits++;
    }
    public boolean bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() == bonusThresholdLimit && countOfPickers == 1) {
                salary += personalBonus;
                isPayed = true;
            } else if (countOfPickers > 1 && countOfPickedUnits >= bonusThresholdLimit / countOfPickers) {
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
