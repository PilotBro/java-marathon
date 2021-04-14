package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("cessna", 1980, 16, 2000);
        Airplane plane2 = new Airplane("piper", 1982, 11, 1900);
        Airplane.compareAirplanes(plane1, plane2);

    }
}