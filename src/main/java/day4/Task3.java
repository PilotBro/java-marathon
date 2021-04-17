package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] array = new int[12][8];
        int sum = 0;
        int indexOfMaxArrayNumber = 0;

        for (int i = 0; i < array.length; i++) {
            int num = 0;
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(51);
                num += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            if (num > sum) {
                sum = num;
                indexOfMaxArrayNumber = i;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Max number is "+ sum);
        System.out.println(indexOfMaxArrayNumber);

    }
}
