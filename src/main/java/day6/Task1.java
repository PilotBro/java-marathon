package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike ducati = new Motorbike("Diavel", "Black", 2021);
        ducati.info();
        System.out.println(ducati.getColor());
        System.out.println(ducati.getModel());
        System.out.println(ducati.getYear());
        System.out.println(ducati.yearDifference(2000));
        System.out.println(ducati.yearDifference(2030));
    }
}
