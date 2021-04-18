package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse mainWarehouse = new Warehouse();
        Warehouse secondaryWarehoese = new Warehouse();

        Picker picker1 = new Picker(mainWarehouse);
        Courier courier1 = new Courier(mainWarehouse);

        Picker picker2 = new Picker(secondaryWarehoese);
        Courier courier2 = new Courier(secondaryWarehoese);

        businessProcess(picker1);
        businessProcess(courier1);

        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println(mainWarehouse.getCountPickedOrders());
        System.out.println(mainWarehouse.getCountDeliveredOrders());

        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

        System.out.println();

        System.out.println(secondaryWarehoese.getCountPickedOrders());
        System.out.println(secondaryWarehoese.getCountDeliveredOrders());

        System.out.println(picker2.getSalary());
        System.out.println(courier2.getSalary());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
