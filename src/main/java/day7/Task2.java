package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        Player red1 = new Player(rnd.nextInt(11) + 90);
        Player red2 = new Player(rnd.nextInt(11) + 90);
        Player red3 = new Player(rnd.nextInt(11) + 90);
        Player blue1 = new Player(rnd.nextInt(11) + 90);
        Player blue2 = new Player(rnd.nextInt(11) + 90);
        Player blue3 = new Player(rnd.nextInt(11) + 90);
//        Player blue4 = new Player(rnd.nextInt(11) + 90);
        Player.info();

        for (int i = 0; i < 100; i++) {
            red1.run();
        }
        System.out.println(red1.getStamina());
        Player.info();
    }
}
