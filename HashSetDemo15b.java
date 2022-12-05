import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetDemo15b {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.add("A");
        set1.add("a");
        set1.add("B");
        set1.add("b");
        set1.add("C");
        set1.add("c");

        set1.stream().collect(Collectors.toMap(s -> s, s -> s.chars().mapToDouble(c -> c).sum())).forEach((k, v) -> System.out.println(k + ":" + v));
        set2.stream().collect(Collectors.toMap(s -> s, s -> s)).forEach((k, v) -> System.out.println(k + ":" + v));
    }
}