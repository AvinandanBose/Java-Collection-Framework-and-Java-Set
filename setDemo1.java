import java.util.Set;
import java.util.TreeSet;

public class setDemo1 {

    Set<String> set =  new TreeSet<>(); 

    public static void main(String[] args) {
        setDemo1 setDemo1 = new setDemo1();
        setDemo1.set.add("A");
        setDemo1.set.add("a");
        setDemo1.set.add("B");
        setDemo1.set.add("b");
        System.out.println(setDemo1.set);
    }


    
}
