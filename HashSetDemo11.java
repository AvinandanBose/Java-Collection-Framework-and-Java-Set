import java.util.HashSet;
public class HashSetDemo11 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(5);
        set2.add(4);
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
  
