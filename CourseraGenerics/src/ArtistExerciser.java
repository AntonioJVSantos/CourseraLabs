import java.util.TreeSet;

import java.util.TreeSet;
public class ArtistExerciser {
    private static void printMemberInstrument(Artist artist,String membername){
        System.out.println("Artist : "+artist.getName()+" Menber: "+membername+" Plays: ");
        for(String instrument:artist.getInstruments(membername)){
            System.out.println(instrument);
        }

    }
    public static void main(String[] args) {
        Artist hotplate = new Artist();
        hotplate.setName("Hot Plate");
        TreeSet<String> instruments1 = new TreeSet<>();
        TreeSet<String> instruments2 = new TreeSet<>();
        instruments1.add("Piano");
        instruments1.add("Clarinet");
        instruments1.add("Murdy Gurdy");
        instruments1.add("Tuba");
        hotplate.addMember("Toa", instruments1);
        instruments2.add("Guitar");
        instruments2.add("Saxophone");
        instruments2.add("Bass Drum");
        hotplate.addMember("Steve", instruments2);
        printMemberInstrument(hotplate,"Toa");
        printMemberInstrument(hotplate,"Steve");
    }
    
}
