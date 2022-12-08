package LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
 public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        LinkedHashSet<String> clonedset = new LinkedHashSet<>();

       
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("G");
        lhs.add("H");
        lhs.add("I");
        lhs.add("J");
        lhs.add("K");
        lhs.add("L");
        lhs.add("M");
        lhs.add("N");
        lhs.add("O");
        lhs.add("P");
        lhs.add("Q");
        lhs.add("R");
        lhs.add("S");
        lhs.add("T");
        lhs.add("U");
        lhs.add("V");
        lhs.add("W");
        lhs.add("X");
        lhs.add("Y");
        lhs.add("Z");


        lhs1.add("A");
        lhs1.add("B");
        lhs1.add("C");
        lhs1.add("D");
        lhs1.add("E");
        lhs1.add("F");
        lhs1.add("G");
        lhs1.add("H");
        lhs1.add("I");
        lhs1.add("J");
        lhs1.add("K");
        lhs1.add("L");
        lhs1.add("M");
        lhs1.add("N");
        lhs1.add("O");
        lhs1.add("P");
        lhs1.add("Q");
        lhs1.add("R");
        lhs1.add("S");
        lhs1.add("T");
        lhs1.add("U");
        lhs1.add("V");
        lhs1.add("W");
        lhs1.add("X");
        lhs1.add("Y");
        lhs1.add("Z");
        System.out.println(lhs);
        lhs.remove("A");
        System.out.println(lhs);
        lhs.clear();

        clonedset = (LinkedHashSet<String>) lhs1.clone();
        System.out.println(clonedset);

        System.out.println(" ");
        Iterator<String> iterator = lhs1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");
        lhs1.iterator().forEachRemaining(System.out::println);
        System.out.println(" ");
        lhs1.iterator().forEachRemaining((String s) -> {
            System.out.println(s);
        });


        System.out.println(" ");

        try {
            Iterator<String> iterator1 = lhs1.iterator();
            Iterator<String> iterator2 = clonedset.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                int comparison = iterator1.next().compareTo(iterator2.next());
                System.out.println(comparison);
            }
        }

        catch (Exception e) {
            System.out.println("Exception");

        }

        try {
            Iterator<String> iterator3 = lhs1.iterator();
            String s = "";
            while (iterator3.hasNext()) {
                s = iterator3.next();
                if (s.equals("Q")) {
                    iterator3.remove();
                }
            }
            System.out.println(lhs1);
        }
        catch (Exception e) {
            System.out.println("Exception");

        }

        lhs1.addAll(clonedset);
        System.out.println(lhs1);

        System.out.println(" ");

        clonedset.retainAll(lhs1);
        System.out.println(clonedset);

        System.out.println(" ");

        Spliterator<String> numbers = clonedset.spliterator();
        numbers.forEachRemaining((n) -> System.out.println("Letters:" + n));

        System.out.println(" ");
        Boolean b = lhs1.contains("B");

        System.out.println(b);

        System.out.println(" ");
        System.out.println(lhs1.size());

        System.out.println(" ");

        boolean c = lhs1.isEmpty();
        System.out.println(c);

        System.out.println(" ");

        // java.util.AbstractCollection

        Boolean d = lhs1.containsAll(clonedset);

        System.out.println(d);

        // java.util.AbstractSet

        System.out.println(" ");

        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();

        lhs2.add("A");
        lhs2.add("a");
        lhs2.removeAll(lhs1);
        System.out.println(lhs2);

        // java.util.Collection

        lhs1.removeIf(str -> str.contains("B"));

        System.out.println(" ");
        System.out.println(lhs1);

        System.out.println(" ");
        lhs1.stream().forEach(s -> System.out.println(s));

        System.out.println(" ");
        lhs1.parallelStream().forEach(s -> System.out.println(s));

        System.out.println(" ");
        Object[] arr = lhs1.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }



    }
    
}
