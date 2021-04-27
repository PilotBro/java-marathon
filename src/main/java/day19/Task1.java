package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/resources/dushi.txt");
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String s = scanner.next();
                if (map.containsKey(s)) {
                    map.replace(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List <Map.Entry<String, Integer>> valuesList = new ArrayList(map.entrySet());
        Collections.sort(valuesList, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(valuesList.get(i));
        }
    }
    // Чичиков встречается 601 раз.
}
