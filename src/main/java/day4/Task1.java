package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rdm = new Random();
        int[] array = new int[in.nextInt()];
        int biggerThanEight = 0;
        int equalOne = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;
        int sumOfNumbers = 0;

        for (int num : array) {
            num = rdm.nextInt();
            if (num > 8) {
                biggerThanEight++;
            } else if (num == 1) {
                equalOne++;
            }
            if (num % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfOddNumbers++;
            }
            sumOfNumbers += num;
        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + biggerThanEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + countOfEvenNumbers);
        System.out.println("Количество нечетных чисел: " + countOfOddNumbers);
        System.out.println("Сумма всех элементов массива: " + sumOfNumbers);
    }
}
