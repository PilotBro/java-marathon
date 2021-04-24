package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");

        printResult(file);

    }

    public static void printResult(File file) {
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(" ");
                for (int i = 0; i < str.length; i++) {
                    sum += Double.parseDouble(str[i]);
                }
                sum /= str.length;
                System.out.printf(Locale.FRANCE,  sum + " --> %.3f", sum);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

