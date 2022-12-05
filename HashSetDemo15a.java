import java.util.HashSet;

public class HashSetDemo15a {

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

        set1.stream().flatMapToDouble(s -> s.chars().mapToDouble(c -> c)).forEach(c -> System.out.println(c));
        set1.stream().flatMapToInt(s -> s.chars()).forEach(c -> System.out.println(c));
        set2.stream().flatMapToInt(s -> s.toString().chars()).forEach(c -> System.out.println(c));
        set1.stream().flatMapToLong(s -> s.chars().mapToLong(c->c)).forEach(c -> System.out.println(c));
        set2.stream().flatMapToLong(s -> s.toString().chars().mapToLong(c -> c)).forEach(c -> System.out.println(c));
    }
}