import java.util.HashSet;

public class HashSetDemo15 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        set1.add("B");
        System.out.println(set);
        set.removeAll(set1);
        System.out.println(set);
    }
    
}
