package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo13 {
    public static void main(String[] args) {
        TreeSet<Float> ts = new TreeSet<>();
        ts.add(50.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(10.78f);
        ts.add(50.98f);
        ts.add(60.65f);
        System.out.println(ts.higher(30.65f));
        System.out.println(ts.lower(30.65f));
    }
    
}
