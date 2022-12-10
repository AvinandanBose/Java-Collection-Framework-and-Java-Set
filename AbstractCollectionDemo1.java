package TreeSet;

import java.util.AbstractCollection;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class AbstractCollectionDemo1 {
    AbstractCollection<Integer> demoCollection = new HashSet<>();
    AbstractCollection<Integer> demoCollection1 = new TreeSet<>();
    AbstractCollection<Integer> demoCollection2 = new CopyOnWriteArraySet<>();

    public static void main(String[] args) {
        AbstractCollectionDemo1 a = new AbstractCollectionDemo1();
        a.demoCollection.add(1);
        a.demoCollection.add(2);
        a.demoCollection.add(3);
        a.demoCollection.add(4);
        System.out.println(a.demoCollection);
    }
}
