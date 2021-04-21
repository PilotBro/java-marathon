package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public List<MusicArtist> getMembers() {
        return members;
    }
    public void addMusicBandMember(MusicArtist member) {
        this.members.add(member);
    }
    public void printMembers() {
        for(MusicArtist str : members) {
            System.out.println(str);
        }
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        for (MusicArtist str : musicBand1.getMembers()) {
            musicBand2.addMusicBandMember(str);
        }
        musicBand1.getMembers().removeAll(musicBand1.getMembers());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year= " + year +
                ", members= " + members +
                '}';
    }
}
