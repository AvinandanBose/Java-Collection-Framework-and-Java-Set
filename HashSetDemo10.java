import java.util.HashSet;
import java.util.Set;
public class HashSetDemo10 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(50);
      set1.addAll(set2); 
      System.out.println(set1);
    }
}
