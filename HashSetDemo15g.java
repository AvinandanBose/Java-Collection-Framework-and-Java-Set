import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class HashSetDemo15g {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(9);
        set1.add(10);

        set2.add("A");
        set2.add("a");
        set2.add("B");
        set2.add("b");
        set2.add("C");
        set2.add("c");

        boolean b = set2.stream().dropWhile(s -> s.length() == 1).allMatch(s -> s.length() == 1);
        boolean c = set2.stream().dropWhile(s -> s.length() == 1).noneMatch(s -> s.length() == 1);
        boolean d = set2.stream().dropWhile(s -> s == "A").anyMatch(s -> s== "A");
        
        Set<Integer> set3 = set1.stream().dropWhile(s -> (s==1)).collect(Collectors.toSet());
        HashSet<Integer>set4 = set1.stream().dropWhile(s -> ((s / 2)==1)).collect(Collectors.toCollection(HashSet::new));
        HashSet<Integer> set5 = set1.stream().dropWhile(s -> (s == 1))
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(set3);
        System.out.println(set4);
        System.out.println(set5);

        
        
        
    }  

}
