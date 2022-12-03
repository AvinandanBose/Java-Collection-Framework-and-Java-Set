import java.util.AbstractCollection;
import java.util.HashSet;
public class AbstractCollectionDemo {
    AbstractCollection<Integer> demoCollection = new HashSet<>();
    public static void main(String[] args) {
        AbstractCollectionDemo a = new AbstractCollectionDemo();
        a.demoCollection.add(1);
        a.demoCollection.add(2);
        a.demoCollection.add(3);
        a.demoCollection.add(4);
        System.out.println(a.demoCollection);
    }
}
