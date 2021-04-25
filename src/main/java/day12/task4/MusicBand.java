package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void addMusicBandMember(String member) {
        this.members.add(member);
    }
    public void printMembers() {
        for(String str : members) {
            System.out.println(str);
        }
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        for (String str : musicBand1.getMembers()) {
            musicBand2.addMusicBandMember(str);
        }
        musicBand1.getMembers().removeAll(musicBand1.getMembers());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
