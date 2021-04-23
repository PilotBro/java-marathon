package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String outFilePath = "/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/resources/shoes.csv";
        String intFilePath = "/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/resources/missing_shoes.txt";
        File outFile = new File(outFilePath);
        File inFile = new File(intFilePath);

        try {
            Scanner scanner = new Scanner(outFile);
            PrintWriter pw = new PrintWriter(inFile);

            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(";");
                if (Integer.parseInt(str[2]) == 0) {
                    pw.println(str[0] + ", " + str[1] + ", " + str[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
