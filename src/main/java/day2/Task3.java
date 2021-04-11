package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + 1;

        if (a >= b ) {
            System.out.println("Некорректный ввод");
        } else {

            while (c < (b - 1)) {
                if (c % 5 == 0 && c % 10 != 0){
                    System.out.print(c + " ");
                }
                c++;
            }
        }
    }
}
