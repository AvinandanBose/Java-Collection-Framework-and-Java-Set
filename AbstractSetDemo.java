import java.util.AbstractSet;
import java.util.HashSet;
public class AbstractSetDemo {
    AbstractSet<Integer> demo = new HashSet<>();
    public static void main(String[] args) {
        AbstractSetDemo a = new AbstractSetDemo();
        a.demo.add(1);
        a.demo.add(2);
        a.demo.add(3);
        a.demo.add(4);
        System.out.println(a.demo);
    }
    
}
