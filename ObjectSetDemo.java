import java.lang.Object;
import java.util.HashSet;
public class ObjectSetDemo {

    public static void main(String[] args) {
        Object demo = new HashSet<>();
        ((HashSet<Object>) demo).add(1);
        ((HashSet<Object>) demo).add(2);
        ((HashSet<Object>) demo).add(3);
        ((HashSet<Object>) demo).add(4);
        System.out.println(demo);
    }
    
}
