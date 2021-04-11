package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rnd = new Random();
        int sumOfTrinity = 0;
        int indexOfFirstNumber = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10001);
        }

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + array[i+1] + array[i+2] > sumOfTrinity) {
                sumOfTrinity = array[i] + array[i+1] + array[i+2];
                indexOfFirstNumber = i;
            }
        }
        System.out.println(sumOfTrinity);
        System.out.println(indexOfFirstNumber);

    }
}
