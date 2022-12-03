import java.util.HashSet;

public class HashSetDemo17 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);
        set.stream().forEach(s -> System.out.println(s));
        set.stream().forEach(System.out::println);
        
    }
}
