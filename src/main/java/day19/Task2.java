package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        File file = new File("/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/resources/numbers19.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                map.put(Integer.parseInt(scanner.nextLine()), 1);
            }

            int count = 0;

            for (Map.Entry<Integer, Integer> mapList : map.entrySet()) {
                if (mapList.getKey() >= 500000 && mapList.getKey() <= 600000) {
                    count++;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
