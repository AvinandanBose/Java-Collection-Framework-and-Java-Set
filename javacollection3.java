import java.util.Collection;
import java.util.TreeSet;
public class javacollection3 {

    Collection<Integer> collection = new TreeSet<>();
    public static void main(String[] args) {
        javacollection3 a = new javacollection3();
        a.collection.add(1);
        a.collection.add(2);
        a.collection.add(3);
        a.collection.add(4);
        System.out.println(a.collection);
    }                       
    
}
