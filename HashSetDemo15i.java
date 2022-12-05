import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo15i {
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

        boolean b = set2.spliterator().hasCharacteristics(Spliterator.ORDERED);
        boolean c = set2.stream().spliterator().hasCharacteristics(Spliterator.DISTINCT);
        boolean d = set2.stream().spliterator().hasCharacteristics(Spliterator.SORTED);
        boolean e = set2.stream().spliterator().hasCharacteristics(Spliterator.SIZED);
        boolean f = set2.stream().spliterator().hasCharacteristics(Spliterator.SUBSIZED);
        boolean g = set2.stream().spliterator().hasCharacteristics(Spliterator.NONNULL);
        boolean h = set2.stream().spliterator().hasCharacteristics(Spliterator.IMMUTABLE);
        boolean i = set2.stream().spliterator().hasCharacteristics(Spliterator.CONCURRENT);

        
        

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        set1.stream().spliterator().tryAdvance(s -> System.out.println(s));
        set2.stream().spliterator().tryAdvance(s -> System.out.println(s));

    }
}
