import java.util.HashSet;
public class HashSetDemo15d {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add("A");
        set2.add("a");
        set2.add("B");
        set2.add("b");
        set2.add("C");
        set2.add("c");
        boolean b = set2.stream().anyMatch(s -> s.equals("A"));
        boolean c = set1.stream().anyMatch(s -> s > 3);
        boolean d = set2.stream().anyMatch(s -> s.charAt(0) == 'A');
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        

    }
}
