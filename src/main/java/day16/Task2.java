package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random rnd = new Random();

        try {
            PrintWriter pw1 = new PrintWriter(file1);

            for (int i = 0; i < 1000; i++) {
                pw1.print(rnd.nextInt(101) + " ");
            }
            pw1.close();

            PrintWriter pw2 = new PrintWriter(file2);
            List<Double> doubleList = new ArrayList<>();
            Scanner sc = new Scanner(file1);

            while (sc.hasNext()) {
                doubleList.add(Double.parseDouble(sc.next()));
            }

            for (int i = 0; i < 1000; i = i + 20) {
                double sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += doubleList.get(j);
                }
                pw2.print(sum / 20 + " ");
                sum = 0;
            }
            pw2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            double sum = 0;
            while (sc.hasNext()) {
                sum += sc.nextDouble();
            }
            System.out.println((int)sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
