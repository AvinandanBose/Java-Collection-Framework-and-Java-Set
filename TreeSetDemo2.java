package TreeSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo2 {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);
    }
    
}
