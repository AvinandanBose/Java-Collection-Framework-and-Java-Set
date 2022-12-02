import java.util.HashSet; 

public class  HashSetDemo5{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);

        set.iterator().forEachRemaining(System.out::println);
        System.out.println(" ");
        set.iterator().forEachRemaining((String s) -> {
            System.out.println(s);
        });

        

    }
}