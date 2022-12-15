package ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Collection;
public class ConcurrentSkipListSet4 {
    public static void main(String[] args) {

        Collection<Float> set = new ConcurrentSkipListSet<>();

        set.add(1.09f);
        set.add(2.89f);
        set.add(3.90f);
        set.add(4.98f);
        System.out.println("===========================");
        //parallelStream
        set.parallelStream().forEach(System.out::println);
        System.out.println("===========================");
        set.parallelStream().forEach(s -> System.out.println(s));

        System.out.println("===========================");
        //stream
        set.stream().forEach(System.out::println);
        System.out.println("===========================");
        set.stream().forEach(s -> System.out.println(s));
        System.out.println("===========================");
      
        //removeIf
        System.out.println("===========================");
        set.removeIf(s -> s > 3.0f);
        System.out.println(set);
        System.out.println("===========================");
        

        
    }
    
}
