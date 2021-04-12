package day6;

public class Motorbike {
    int year;
    String color;
    String model;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear) {
        int result = year - inputYear;
        return Math.abs(result);
    }
}
