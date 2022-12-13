package CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;
public class copyonwritearrayset2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // stream

        set.stream().forEach(System.out::println);
        set.stream().forEach((Integer i) -> {
            System.out.println(i);
        });

        // parallelStream

        set.parallelStream().forEach(System.out::println);
        set.parallelStream().forEach((Integer i) -> {
            System.out.println(i);
        });

    }
}
