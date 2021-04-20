package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return  countPickedOrders;
    }
    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders++;
    }
    public void incrementCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Количество собранных товаров: " + countPickedOrders + System.lineSeparator() +
                "Количество доставленных товаров: " + countDeliveredOrders;
    }
}
