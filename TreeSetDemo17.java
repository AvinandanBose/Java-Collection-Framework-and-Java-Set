package TreeSet;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class NewTreeComparator implements Comparator<Float> {

    public int compare(Float obj1, Float obj2) {

        if (((Float)obj1).equals((Float)obj2)) {
            return -1;
        }

        // using compareTo() to ensure
        return obj2.compareTo(obj2);
    }

    


}

// Main class
// TreeSetDemo class
public class TreeSetDemo17 {
    public static void main(String[] args) {

        TreeSet<Float> ts = new TreeSet<>(new NewTreeComparator());

        TreeSet<Float> ts1 = new TreeSet<>(new NewTreeComparator());

        ts.add(10.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(10.47f);
        ts.add(50.98f);
        ts.add(60.65f);

        ts1.add(10.55f);
        ts1.add(20.78f);
        ts1.add(34.65f);
        ts1.add(45.78f);
        ts1.add(57.98f);
        ts1.add(99.65f);
    

        Iterator<Float> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //As 20.78f is present in both the treeset, it will return -1 . i.e. 
        //it will end the iterations.

        System.out.println(ts.comparator().compare( 99.65f, 10.58f)) ;

        // Return 0 as both numbers are compared.

        System.out.println(ts.comparator().compare(20.78f, 20.78f)) ;
        //Return -1 as both numbers are equal.
    }
}
