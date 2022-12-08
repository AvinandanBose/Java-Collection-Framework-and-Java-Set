package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo16 {
    public static void main(String[] args) {
        TreeSet<Float> ts = new TreeSet<>();
        TreeSet<Float> ts1 = new TreeSet<>();
        ts.add(10.58f);
        ts.add(20.78f);
        ts.add(30.65f);
        ts.add(10.47f);
        ts.add(50.98f);
        ts.add(60.65f);

        ts1.add(10.55f);
        ts1.add(25.88f);
        ts1.add(34.65f);
        ts1.add(45.78f);
        ts1.add(57.98f);
        ts1.add(99.65f);

      
    ts1.descendingSet().forEach(System.out::println);
    ts1.descendingSet().forEach(s -> System.out.println(s));

    TreeSet<Float> ts2 = new TreeSet<>();
    for (int i = 0; i < ts1.size(); i++) {
        ts1.descendingSet().forEach(s -> ts2.add(s));
        ts2.addAll(ts1.descendingSet());
        

    }
    
    System.out.println(ts2);

    }
}
