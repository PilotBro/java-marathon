package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike ducati = new Motorbike(2021, "red", "Multistrada");

        System.out.println("Год выпуска вашего мотоцикла: " + ducati.getYear());
        System.out.println("Цвет вашего мотоцикла: " + ducati.getColor());
        System.out.println("Модель вашего мотоцикла: " + ducati.getModel());
    }
}
