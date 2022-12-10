package TreeSet;

import java.util.HashSet;
public class HashSetDemo24 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");

         set.hashCode();

        System.out.println(set.hashCode());

        set.forEach(i -> System.out.println(i.hashCode()) );
    }


    }

