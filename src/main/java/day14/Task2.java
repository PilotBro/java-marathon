package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String path = "/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/java/day14/people.txt";
        File file = new File(path);

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split(" ");
                if (Integer.parseInt(str[1]) < 0) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


        return list;
    }
}
