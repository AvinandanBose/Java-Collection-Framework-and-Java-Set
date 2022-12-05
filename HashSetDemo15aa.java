import java.util.HashSet;
public class HashSetDemo15aa {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add("A");
        set1.add("a");
        set1.add("B");
        set1.add("b");
        set1.add("C");
        set1.add("c");

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        set1.stream().mapToDouble(s -> s.chars().mapToDouble(c -> c).sum()).forEach(c -> System.out.println(c));
        set1.stream().mapToInt(s -> s.chars().sum()).forEach(c -> System.out.println(c));
        set2.stream().mapToInt(s -> s.toString().chars().sum()).forEach(c -> System.out.println(c));
        set1.stream().mapToLong(s -> s.chars().mapToLong(c -> c).sum()).forEach(c -> System.out.println(c));
        set2.stream().mapToLong(s -> s.toString().chars().mapToLong(c -> c).sum()).forEach(c -> System.out.println(c));
     }
}
