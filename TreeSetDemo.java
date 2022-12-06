package TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Spliterator;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> clonedset = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        set1.add("B");
        set1.add("b");
        set1.add("C");
        set1.add("c");

        treeSet.add(2);
        treeSet1.add(1);

        System.out.println(set);
        set.remove("A");
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(" ");
        clonedset = (TreeSet<String>) set1.clone();
        System.out.println(clonedset);
        System.out.println(" ");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ");
        set1.iterator().forEachRemaining(System.out::println);
        System.out.println(" ");
        set1.iterator().forEachRemaining((String s) -> {
            System.out.println(s);
        });

        System.out.println(" ");
        
 
        try {
            Iterator<Integer> iterator1 = treeSet.iterator();
            Iterator<Integer> iterator2 = treeSet1.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                int comparison = iterator1.next().compareTo(iterator2.next());
                System.out.println(comparison);
            }
        }

        catch (Exception e) {
            System.out.println("Exception");

        }

        try {
            Iterator<String> iterator3 = set1.iterator();
            String s = "";
            while (iterator3.hasNext()) {
                s = iterator3.next();
                if (s.equals("c")) {
                    iterator3.remove();
                }
            }
            System.out.println(set1);
        }

        catch (Exception e) {
            System.out.println("Exception");

        }
        set1.addAll(clonedset);
        System.out.println(set1);

        System.out.println(" ");

        clonedset.retainAll(set1);
        System.out.println(clonedset);

        System.out.println(" ");
        
        Spliterator<String> numbers = clonedset.spliterator();
        numbers.forEachRemaining((n) -> System.out.println("Letters:" + n));

        System.out.println(" ");
        Boolean b = set1.contains("B");

        System.out.println(b);

        System.out.println(" ");
        System.out.println(set1.size());

        System.out.println(" ");

        boolean c = set1.isEmpty();
        System.out.println(c);

        System.out.println(" ");

        // java.util.AbstractCollection

        Boolean d = set1.containsAll(clonedset);

        System.out.println(d);

        // java.util.AbstractSet

        System.out.println(" ");

        TreeSet<String> set3 = new TreeSet<>();

        set3.add("A");
        set3.add("a");
        set1.removeAll(set3);
        System.out.println(set1);

        //java.util.Collection

        set1.removeIf(str -> str.contains("B"));

        System.out.println(" ");
        System.out.println(set1);

        System.out.println(" ");
        set1.stream().forEach(s -> System.out.println(s));

        System.out.println(" ");
        set1.parallelStream().forEach(s -> System.out.println(s));

        System.out.println(" ");
        Object[] arr = set1.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

    
    }
    
}
