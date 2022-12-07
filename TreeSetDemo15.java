package TreeSet;

import java.util.TreeSet;
public class TreeSetDemo15 {
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

        System.out.println(ts.first());
        System.out.println(ts1.last());
       
    }
    
}
