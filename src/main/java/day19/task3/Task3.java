package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("/Users/pilotbro/IdeaProjects/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        Map<Integer, Point> mapPoint = new HashMap<>();
        try {
            Scanner scanner1 = new Scanner(file);
            while(scanner1.hasNextLine()){
                String[] str= scanner1.nextLine().split(" ");
                mapPoint.put(Integer.parseInt(str[0]), new Point(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите координаты первой точки. \nx1: ");
        int x1 = scanner2.nextInt();
        System.out.print("y1: ");
        int y1 = scanner2.nextInt();
        System.out.print("Введите координаты второй точки. \nx2: ");
        int x2 = scanner2.nextInt();
        System.out.print("y2: ");
        int y2 = scanner2.nextInt();
        scanner2.close();
        int count = 0;

        for (Map.Entry<Integer,Point> pointer : mapPoint.entrySet()) {
            if (pointer.getValue().getX() > x1 && pointer.getValue().getX() < x2 && pointer.getValue().getY() > y1 && pointer.getValue().getY() < y2) {
                System.out.println(pointer.getKey());
                count++;
            }
        }
        System.out.println("Рядом с вами находится " + count + " машин.");


    }
}

