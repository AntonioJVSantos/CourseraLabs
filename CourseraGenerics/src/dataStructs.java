import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
public class dataStructs {
    public static void main(String[] args) {
     
    TreeSet<String> ts = new TreeSet<String>();
    ts.add("Zebra");
    ts.add("Cão");
    ts.add("Gato");
    ts.add("Urso");
    Iterator<String> i = ts.iterator();
    while(i.hasNext()){
        System.out.println(i.next());   
        }
    }
    
}
