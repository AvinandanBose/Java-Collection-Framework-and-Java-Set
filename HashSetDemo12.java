import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo12 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        Spliterator<Integer> numbers = set1.spliterator();
        numbers.forEachRemaining((n)->System.out.println("Numbers:"+n));
    }
    
}
