import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
    private String name;
    private SortedSet<String> memberNames;
    private Map<String,SortedSet<String>> memberInstruments;
    public Artist(){
        memberNames = new TreeSet();
        memberInstruments = new TreeMap();
    }
    public Artist(String name, SortedSet<String> memberNames,Map<String,SortedSet<String>> memberInstruments){
        // Super();
        setName(name);
        this.memberNames=memberNames;
        this.memberInstruments=memberInstruments;

    }
    public void addMember(String name,SortedSet<String> instruments){
        memberNames.add(name);
        memberInstruments.put(name,instruments);
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return this.name;
    }
    public SortedSet<String> getMembers(){
        return memberNames;
    }
    public SortedSet<String> getInstruments(String memberName){
        return memberInstruments.get(memberName);
    }
    
}
