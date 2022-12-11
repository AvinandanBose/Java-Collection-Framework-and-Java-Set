package EnumSet;

import java.util.EnumSet;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}



public class EnumSetDemo3 {

    public static void main(String[] args) {
        EnumSet<Days> set1 = EnumSet.allOf(Days.class);

        EnumSet<Days> set2  = set1.clone();


        System.out.println(set1);
        System.out.println(set2);
    }
    
}
