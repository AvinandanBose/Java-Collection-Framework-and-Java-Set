import java.util.HashSet;
public class HashSetDemo {
    
    HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        HashSetDemo setDemo = new HashSetDemo();
        setDemo.set.add(1);
        setDemo.set.add(2);
        setDemo.set.add(3);
        setDemo.set.add(4);
        System.out.println(setDemo.set);

        

    }
    
}
