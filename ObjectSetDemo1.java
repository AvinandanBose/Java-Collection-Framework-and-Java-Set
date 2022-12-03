import java.lang.Object;
import java.util.HashSet;

public class ObjectSetDemo1 {

    public static void main(String[] args) {
        HashSet<Object> demo = new HashSet<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        System.out.println(demo);
    }

}
