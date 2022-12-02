import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo9 {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(2);

        System.out.println(set1);
        set2.add(1);
        System.out.println(set2);

        try {
            Iterator<Integer> iterator1 = set1.iterator();
            Iterator<Integer> iterator2 = set2.iterator();
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
