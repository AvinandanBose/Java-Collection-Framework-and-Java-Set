import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo8 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);

        try {
            Iterator<String> iterator = set.iterator();
            String s = "";
            while (iterator.hasNext()) {
                s = iterator.next();
                if (s.equals("a")) {
                    iterator.remove();
                }
            }
            System.out.println(set);   
        }

        catch (Exception e) {
            System.out.println("Exception");

        }

    }
}
