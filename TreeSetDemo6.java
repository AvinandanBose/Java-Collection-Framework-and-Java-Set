package TreeSet;

import java.util.TreeSet;
public class TreeSetDemo6 {
    public static void main(String[] args) {
        // Create a TreeSet of String objects.
        TreeSet<Float> ts = new TreeSet<>();
        ts.add(10.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(40.78f);
        ts.add(50.98f);
        ts.add(60.65f);
        TreeSet<Float> ts1 = new TreeSet<>();
        ts1.addAll(ts.subSet(20.78f, 40.78f));
        System.out.println("(Sub Set)Elements in the range 20.78 to 40.78 are:" + ts1);
        System.out.println(ts.subSet(20.78f, 40.78f));
        
    }
}
