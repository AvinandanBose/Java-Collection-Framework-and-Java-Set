package EnumSet;

import java.util.EnumSet;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumSetDemo2 {

    public static void main(String[] args) {
        EnumSet<Days> set1 = EnumSet.allOf(Days.class);

        
        System.out.println(set1);
    }
    
}
