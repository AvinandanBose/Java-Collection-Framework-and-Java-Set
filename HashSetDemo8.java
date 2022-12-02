import java.util.HashSet;

public class HashSetDemo8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);

        try {
           set.iterator().remove();
           System.out.println(set);
        } 

         catch (Exception e) {
            System.out.println("Exception");

        }

    }
}
