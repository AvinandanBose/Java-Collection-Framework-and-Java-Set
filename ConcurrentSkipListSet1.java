package ConcurrentSkipListSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet1 {

    public static void main(String[] args) {
        ConcurrentSkipListSet<Float> set = new ConcurrentSkipListSet<>();

        // Add
        set.add(1.09f);
        set.add(2.89f);
        set.add(3.90f);
        set.add(4.98f);
        System.out.println(set);

        // ceiling

        System.out.println(set.ceiling(1.09f));

        // floor
        System.out.println(set.floor(2.89f));

        ConcurrentSkipListSet<Float> set1 = new ConcurrentSkipListSet<>();
        set1.add(1.09f);
        set1.add(2.89f);
        set1.add(3.90f);
        set1.add(4.98f);
        // clear
        set.clear();
        System.out.println(set);

        // clone
        ConcurrentSkipListSet<Float> clonedset = new ConcurrentSkipListSet<>();
        clonedset = (ConcurrentSkipListSet<Float>) set1.clone();
        System.out.println(clonedset);

        // comparator
        ConcurrentSkipListSet<Float> set2 = new ConcurrentSkipListSet<>(new ConcurrentSkipListSetComparator());
        ConcurrentSkipListSet<Float> set3 = new ConcurrentSkipListSet<>(new ConcurrentSkipListSetComparator());
        set2.add(10.58f);
        set2.add(20.78f);
        set2.add(30.65f);
        set2.add(10.47f);
        set2.add(50.98f);
        set2.add(60.65f);
        set3.add(10.55f);
        set3.add(20.78f);
        set3.add(34.65f);
        set3.add(45.78f);
        set3.add(57.98f);
        set3.add(99.65f);

        System.out.println(set2.comparator().compare(99.65f, 10.58f));
        System.out.println(set2.comparator().compare(20.78f, 20.78f));

        // contains

        System.out.println(set1.contains(1.09f));

        // descendingIterator
        Iterator<Float> iterator = set1.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // descendingSet
        System.out.println(set1.descendingSet());
        System.out.println(set1.descendingSet().descendingSet());
        System.out.println(set1.descendingSet().descendingSet().descendingSet());

        // equals
        System.out.println(set1.equals(set2));

        // first

        System.out.println(set1.first());

        // headSet
        System.out.println(set1.headSet(2.89f));
        System.out.println(set1.headSet(2.89f, true));
        System.out.println(set1.headSet(2.89f, false));

        // higher
        System.out.println(set1.higher(2.89f));

        // isEmpty
        System.out.println(set1.isEmpty());
        System.out.println(set.isEmpty());

        // last
        System.out.println(set1.last());

        // lower
        System.out.println(set1.lower(2.89f));

        // pollFirst
        System.out.println(set1.pollFirst());

        // pollLast
        System.out.println(set1.pollLast());

        // remove
        set1.remove(1.09f);
        System.out.println(set1);

        // removeAll
        clonedset.removeAll(set1);
        System.out.println(clonedset);

        // size
        System.out.println(set1.size());

        // spliterator

        set1.spliterator().forEachRemaining((Float s) -> {
            System.out.println(s);
        });
        
        System.out.println(set1.spliterator().estimateSize());
        System.out.println(set1.spliterator().getExactSizeIfKnown());
        System.out.println(set1.spliterator().hasCharacteristics(Spliterator.CONCURRENT));

        //....And it runs all functions of Spliterator interface

        // subSet
        set1.add(4.98f);
        System.out.println(set1.subSet(2.89f, 4.98f));
        System.out.println(set1.subSet(2.89f,true ,4.98f, true));

        //tailset
        System.out.println(set1.tailSet(2.89f));
        System.out.println(set1.tailSet(2.89f, true));
        System.out.println(set1.tailSet(2.89f, false));


    }

}

// comparator

class ConcurrentSkipListSetComparator implements Comparator<Float> {

    public int compare(Float obj1, Float obj2) {

        if (((Float) obj1).equals((Float) obj2)) {
            return -1;
        }

        // using compareTo() to ensure
        return obj2.compareTo(obj2);
    }

}
