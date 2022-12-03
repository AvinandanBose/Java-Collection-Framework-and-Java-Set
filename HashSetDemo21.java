import java.util.HashSet;

public class HashSetDemo21 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");

        Boolean b = set.isEmpty();
        System.out.println(b);
        set.clear();
        Boolean c = set.isEmpty();
        System.out.println(c);
    }
}

        
  