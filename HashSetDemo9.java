import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo9 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> cloned_set = new HashSet<>();
        set.add(2);

        System.out.println(set);
        cloned_set.add(1);
        System.out.println(cloned_set);

        try {
            Iterator<Integer> iterator1 = set.iterator();
            Iterator<Integer> iterator2 = cloned_set.iterator();
            while (iterator1.hasNext() && iterator2.hasNext()) {
                int comparison = iterator1.next().compareTo(iterator2.next());
                System.out.println(comparison);
            }
        }

        catch (Exception e) {
            System.out.println("Exception");

        }

    }

}
