package CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;
public class copyonwritearrayset3 {
    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // hashCode
        System.out.println(set.hashCode());                              
    }
}
