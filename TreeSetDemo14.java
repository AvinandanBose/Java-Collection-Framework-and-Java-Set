package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo14 {

    public static void main(String[] args) {
        TreeSet<Float> ts = new TreeSet<>();
        TreeSet<Float> ts1 = new TreeSet<>();
        ts.add(10.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(40.78f);
        ts.add(50.98f);
        ts.add(60.65f);

        ts1.add(10.55f);
        ts1.add(25.88f);
        ts1.add(34.65f);
        ts1.add(45.78f);
        ts1.add(57.98f);
        ts1.add(99.65f);
        ts.descendingIterator().forEachRemaining(s -> System.out.println(s));

        boolean b = ts.descendingIterator().hasNext();
        System.out.println(b);

        Iterator<Float> i = ts.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            System.out.println("");
            Iterator<Float> j = ts1.descendingIterator();
            try {
                while (i.hasNext() && j.hasNext()) {
                    float comparison = j.next().compareTo(i.next());
                    System.out.println(comparison);
                }
            } catch (Exception e) {
                System.out.println("Exception");
            }

        }
    }
}
