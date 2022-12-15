package ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.AbstractCollection;
public class ConcurrentSkipListSet2 {
    
    public static void main(String[] args) {
        AbstractCollection<Float> set = new ConcurrentSkipListSet<>();
        set.add(1.09f);
        set.add(2.89f);
        set.add(3.90f);
        set.add(4.98f);
        
        //addAll
        AbstractCollection<Float> set1 = new ConcurrentSkipListSet<>();
        set1.addAll(set);
        System.out.println(set1);

        // containsAll
       Boolean b =  set1.containsAll(set);
         System.out.println(b);

         //retainAll

            set1.retainAll(set);
            System.out.println(set1);


            //toArray
            Object[] arr = set1.toArray();
            for(Object o : arr){
                System.out.println(o);
            }

            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }

            //toArray(T[] a)
            Float[] arr1 = new Float[set1.size()];
            set1.toArray(arr1);
            for(int i = 0; i < arr1.length; i++){
                System.out.println(arr1[i]);
            }

            //toString
            System.out.println(set1.toString());

    }
}
 