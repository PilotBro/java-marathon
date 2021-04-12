package day5;

public class Task1 {
    public static void main(String[] args) {
        Car astonMartin = new Car();
        astonMartin.setYear(1980);
        astonMartin.setColor("Grey");
        astonMartin.setModel("DB9");

        System.out.println("Цвет вашего автомобиля: " + astonMartin.getColor());
        System.out.println("Год создания вашего автомобиля: " + astonMartin.getYear());
        System.out.println("Модель вашего автомобиля: " + astonMartin.getModel());

    }
}
