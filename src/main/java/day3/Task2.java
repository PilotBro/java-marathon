package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        while (true) {
            if (b == 0 || a == 0) {
                break;
            }
            System.out.println(a / b);
            a = in.nextDouble();
            b = in.nextDouble();

        }
    }
}
