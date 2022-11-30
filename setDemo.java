import java.util.HashSet;
import java.util.Set;

public class setDemo {

 Set <Integer> set = new HashSet<>();

    public static void main(String[] args){
        setDemo setDemo = new setDemo();
        setDemo.set.add(1);
        setDemo.set.add(1);
        setDemo.set.add(2);                     
        setDemo.set.add(3);
        setDemo.set.add(4);
        setDemo.set.add(5);
        System.out.println(setDemo.set);
    }
    
}
