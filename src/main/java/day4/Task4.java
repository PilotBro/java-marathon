package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int sumOfTrinity = 0;
        int indexOfFirstNumber = 0;
        int countOfAdditionNumbers = 2;

        int[] array = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10001);
        }

        for (int i = 0; i < array.length - (countOfAdditionNumbers - 1); i++) {
            int sum = 0;
            for (int j = 0; j < countOfAdditionNumbers; j++) {
                sum += array[i + j];
            }
            if (sum > sumOfTrinity) {
                sumOfTrinity = sum;
                indexOfFirstNumber = i;
            }

        }
        System.out.println(sumOfTrinity);
        System.out.println(indexOfFirstNumber);

    }
}
