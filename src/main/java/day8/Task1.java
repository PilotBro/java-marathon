package day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "";

        long start1 = System.nanoTime();
        for (int i = 1; i < 20001; i++) {
            str = str + i + " ";
        }
//        System.out.println(str);
        long finish1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 1; i < 20001; i++) {
            sb.append(" " + i);
        }
//        System.out.println(sb.toString());
        long finish2 = System.nanoTime();

        System.out.printf("Время затраченное на создание строки: \n способ №1: %d\n способ №2: %d", (finish1 - start1), (finish2 - start2));
    }
}
