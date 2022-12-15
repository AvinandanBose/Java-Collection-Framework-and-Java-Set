package ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Iterator;
import  java.lang.Iterable;
public class ConcurrentSkipListSet5 {
    public static void main(String[] args) throws Exception {
        ConcurrentSkipListSet<Float> set = new ConcurrentSkipListSet<>();
        set.add(1.09f);
        set.add(2.89f);
        set.add(3.90f);
        set.add(4.98f);
        // iterator
        Iterator<Float> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // iterable
        Iterable<Float> iterable = set;
        Iterator<Float> it1 = iterable.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
 
