import java.util.HashSet;

public class HashSetDemo19 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);
        Object[] arr = set.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        System.out.println("");

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("");

        String[] arr2 = set.toArray(new String[set.size()]);

        for (String s : arr2) {
            System.out.println(s);
        }

    }
}
