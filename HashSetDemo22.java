package TreeSet;
import java.util.HashSet;

public class HashSetDemo22 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        set1.add("A");
        set1.add("a");
        set1.add("B");
        set1.add("b");

       boolean b = set1.equals(set);
         System.out.println(b);
    }
}