package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo9 {
    public static void main(String[] args) {
        TreeSet<Float> ts = new TreeSet<>();
        ts.add(10.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(40.78f);
        ts.add(50.98f);
        ts.add(60.65f);
       ts.tailSet(20.78f);
        System.out.println(ts.tailSet(20.78f));
        System.out.println(ts.tailSet(30.65f));
        

    }
}