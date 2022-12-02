import java.util.HashSet;
public class HashSetDemo6 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("b");
        System.out.println(set);

        try {
            Boolean a = set.iterator().hasNext();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Exception");

        }
        
        

    }

    
}
//Returns true if the iteration has more elements. (In other words, returns true if next would return an element rather than throwing an exception.)