import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> cloned_set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);

        cloned_set = (HashSet)set.clone();
        System.out.println(cloned_set);

    }

}
