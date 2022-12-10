package TreeSet;

import java.util.HashSet;

public class HashSetDemo23 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");

        String s = set.toString();
        System.out.println(s);
    }

}
