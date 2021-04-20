package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Citroen");
        auto.add("Lagonda");
        auto.add("Aston Martin");
        auto.add("Lancia");
        auto.add("Fiat");

        System.out.println(auto);

        auto.add(2, "Maserati");
        auto.remove("Citroen");

        System.out.println(auto);
    }
}
