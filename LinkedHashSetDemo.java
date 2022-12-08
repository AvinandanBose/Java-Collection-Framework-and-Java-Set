package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.HashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args){
        HashSet<String> lsh = new LinkedHashSet<>();
        lsh.add("A");
        System.out.println("LinkedHashSet: " + lsh);
    }
    
}
