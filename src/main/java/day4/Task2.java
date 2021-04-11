package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
//        int[] array = {1,2,3,4,5,6,7,8,9,10,10,20};
        Random rnd = new Random();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int endsWithZero = 0;
        int sumOfZero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10001);
        }

        for (int num : array) {
            if (num > maxNumber) {
                maxNumber = num;
            }
            if (num < minNumber) {
                minNumber = num;
            }
            if (Integer.toString(num).endsWith("0")) {
                endsWithZero++;
                sumOfZero += num;
            }
        }
        System.out.println("наибольший элемент массива: " + maxNumber);
        System.out.println("наименьший элемент массива: " + minNumber);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + endsWithZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumOfZero);
    }
}
