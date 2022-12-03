import java.util.HashSet;

public class HashSetDemo16 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);
        set.removeIf(str -> str.contains("A"));  
        System.out.println(set);                       
    }
    

    
}
