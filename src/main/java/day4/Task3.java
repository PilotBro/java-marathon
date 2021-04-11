package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] array = new int[12][8];
        int[] maxArray = new int[array.length];
        int sum = 0;
        int maxArrayNumber = 0;
        int indexOfMaxArrayNumber = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(51);
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            maxArray[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] >= maxArrayNumber) {
                maxArrayNumber = maxArray[i];
                indexOfMaxArrayNumber = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Max number is "+ maxArrayNumber);
        System.out.println(indexOfMaxArrayNumber);

    }
}
