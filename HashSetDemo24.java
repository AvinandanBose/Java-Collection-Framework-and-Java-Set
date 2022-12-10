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
        //this is from : java.util.AbstractSet.hashCode()

        System.out.println(set.hashCode());

        set.forEach(i -> System.out.println(i.hashCode()) );
        //Note : i.hashCode() is of Wrapper Class String's Hash Code and not of Abstract Set.
        //i.e. : java.lang.String.hashCode()
    }


    }

