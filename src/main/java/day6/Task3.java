package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher fedor = new Teacher("Федор Степанович", "Математика");
        Student max = new Student("Максим");

        fedor.evaluate(max);

    }
}
