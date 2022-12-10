package TreeSet;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
public class AbstractSetDemo1 {

    AbstractSet<Integer> demo = new HashSet<>();
    AbstractSet<Integer> demo1 = new TreeSet<>();
    AbstractSet<Integer> demo2 = new LinkedHashSet<>();
    AbstractSet<Integer> demo3 = new CopyOnWriteArraySet<>();

    public static void main(String[] args) {
        AbstractSetDemo1 a = new AbstractSetDemo1();
        a.demo.add(1);
        a.demo.add(2);
        a.demo.add(3);
        a.demo.add(4);

        a.demo1.add(1);
        a.demo1.add(2);
        a.demo1.add(3);
        a.demo1.add(4);

        a.demo2.add(1);
        a.demo2.add(2);
        a.demo2.add(3);
        a.demo2.add(4);

        a.demo3.add(1);
        a.demo3.add(2);
        a.demo3.add(3);
        a.demo3.add(4);

        a.demo1.equals(a.demo2);
        a.demo1.hashCode();

        System.out.println(a.demo);
        System.out.println("    ");
        System.out.println(a.demo1);
        System.out.println("    ");
        System.out.println(a.demo2);
        System.out.println("    ");
        System.out.println(a.demo3);
    }
    
}
