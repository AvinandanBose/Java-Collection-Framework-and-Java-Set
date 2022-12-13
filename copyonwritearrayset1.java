package CopyOnWriteArraySet;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyonwritearrayset1 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<Integer> set1 = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<Integer> set2 = new CopyOnWriteArraySet<>();
        // Add -1
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        // AddAll - 2
        set1.addAll(set);
        set2.addAll(set);
        System.out.println(set1);
        System.out.println(set2);

        // Remove - 10
        set.remove(1);
        System.out.println(set);

        // RemoveAll - 11
        set1.removeAll(set);
        System.out.println(set1);

        // Clear - 3

        set1.clear();
        System.out.println(set1);

        // Contains - 4
        System.out.println(set.contains(2));

        // ContainsAll - 5
        System.out.println(set.containsAll(set1));

        // IsEmpty - 8
        System.out.println(set1.isEmpty());

        // Size - 14
        System.out.println(set.size());
        System.out.println(set1.size());
        System.out.println(set2.size());

        // ToArray -16
        Object[] arr = set.toArray();
        for (Object i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < set.size(); i++) {
            System.out.println(arr[i]);
        }

        // Iterator - 9
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.add(1);
        System.out.println(" Iterator CompareTo");
        // CompareTo
        try {
            Iterator<Integer> iterator1 = set.iterator();
            Iterator<Integer> iterator2 = set2.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                int comparison = iterator2.next().compareTo(iterator1.next());
                System.out.println(comparison);
            }
        } catch (Exception e) {
            System.out.println("Exception");

        }

        // stream

        set.stream().forEach(System.out::println);
        set.stream().forEach((Integer i) -> {
            System.out.println(i);
        });

        // parallelStream

        set.parallelStream().forEach(System.out::println);
        set.parallelStream().forEach((Integer i) -> {
            System.out.println(i);
        });

        // removeIf - 12

        set.removeIf(i -> i == 1);
        System.out.println(set);

        //Spliterator - 15
        set.spliterator().forEachRemaining(System.out::println);
        set.spliterator().forEachRemaining((Integer i) -> {
            System.out.println(i);
        });

        //RetainAll- 13
        set.retainAll(set2);
        System.out.println(set);

        //equals - 6
        Boolean b = set.equals(set2);
        System.out.println(b);

        //foreach - 7
        set.forEach(System.out::println);

        set.forEach((Integer i) -> {
            System.out.println(i);
        });


    }
}
