package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");

        printSumDigits(file);

    }
    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String[] str = scanner.nextLine().split(" ");

            for (int i = 0; i < 10; i++) {
                sum += Integer.parseInt(str[i]);
            }

            System.out.println(sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
