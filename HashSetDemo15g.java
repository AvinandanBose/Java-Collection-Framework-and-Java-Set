import java.util.HashSet;


public class HashSetDemo15g {
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

        boolean b = set2.stream().dropWhile(s -> s.length() == 1).allMatch(s -> s.length() == 1);
        boolean c = set2.stream().dropWhile(s -> s.length() == 1).noneMatch(s -> s.length() == 1);
        boolean d = set2.stream().dropWhile(s -> s == "A").anyMatch(s -> s== "A");
        

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
    }  

}
