package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("John Bobovski");
        firstList.add("Misha Potatkin");
        List<String> secondList = new ArrayList<>();
        secondList.add("Karl Rozental");
        secondList.add("Maria Braichenko");

        MusicBand mb = new MusicBand("Strings", 1965, firstList);
        MusicBand mb2 = new MusicBand("Kozlonogi", 1991, secondList);

        System.out.println("Band list");
        System.out.println("first");
        mb.printMembers();
        System.out.println("second");
        mb2.printMembers();

        MusicBand.transferMembers(mb, mb2);

        System.out.println("Band list");
        System.out.println("first");
        mb.printMembers();
        System.out.println("second");
        mb2.printMembers();

    }
}
