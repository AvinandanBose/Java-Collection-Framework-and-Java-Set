import java.util.HashSet;

public class HashSetDemo14 {
    




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
        System.out.println(set1);

        Boolean b = set.containsAll(set);

        System.out.println(b);

    }

}

