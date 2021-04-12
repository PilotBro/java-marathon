package day6;

public class Car {

    int year;
    String color;
    String model;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        int result = year - inputYear;
        return Math.abs(result);
    }
}
