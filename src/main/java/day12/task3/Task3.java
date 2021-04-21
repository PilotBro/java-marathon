package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("Metallica", 1981));
        musicBands.add(new MusicBand("Queen", 1970));
        musicBands.add(new MusicBand("Guns N `Roses", 1985));
        musicBands.add(new MusicBand("Led Zeppelin", 1968));
        musicBands.add(new MusicBand("Обі́йми Дощу́", 2006));
        musicBands.add(new MusicBand("Машру Лейла", 2008));
        musicBands.add(new MusicBand("After Forever", 1995));
        musicBands.add(new MusicBand("Ленингра́д", 2008));
        musicBands.add(new MusicBand("Zdob și Zdub", 1960));

        Collections.shuffle(musicBands);
        List<MusicBand> musicBandsAfter2000 = groupsAfter2000(musicBands);
        System.out.println(musicBands.toString());
        System.out.println(musicBandsAfter2000.toString());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandList = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                musicBandList.add(band);
            }
        }
        return musicBandList;
    }
}
