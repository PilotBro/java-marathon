package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistFirstList = new ArrayList<>();
        musicArtistFirstList.add(new MusicArtist("Romires andatres", 1970));
        musicArtistFirstList.add(new MusicArtist("Billi Bob", 1980));
        List<MusicArtist> musicArtistSecondList = new ArrayList<>();
        musicArtistSecondList.add(new MusicArtist("Roberto Bravo", 1991));
        musicArtistSecondList.add(new MusicArtist("Maria Santes", 1998));


        MusicBand gringos = new MusicBand("Gringos", 2017, musicArtistFirstList);
        MusicBand fahitos = new MusicBand("Fahitos", 1996, musicArtistSecondList);
        System.out.println("before");
        System.out.println("gringos");
        gringos.printMembers();
        System.out.println("fahitos");
        fahitos.printMembers();

        MusicBand.transferMembers(gringos, fahitos);
        System.out.println("after");
        System.out.println("gringos");
        gringos.printMembers();
        System.out.println("fahitos");
        fahitos.printMembers();
        System.out.println(fahitos);

    }
}
