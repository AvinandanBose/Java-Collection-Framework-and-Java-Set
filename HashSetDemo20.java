import java.util.HashSet;

public class HashSetDemo20 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
       
        System.out.println(set);
       
        System.out.println(set.size());
    }
    
    
}
