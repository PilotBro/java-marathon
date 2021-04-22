package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String path = "/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/java/day14/people.txt";
        File file = new File(path);

        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split(" ");
                if (Integer.parseInt(str[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        break;
                    }
                }
                list.add(new Person(str[0], Integer.parseInt(str[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return list;
    }
}
