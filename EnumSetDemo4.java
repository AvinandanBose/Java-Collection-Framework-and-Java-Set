package EnumSet;

import java.util.EnumSet;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumSetDemo4 {

    public static void main(String[] args) {
        
        EnumSet<Days> set1 = EnumSet.complementOf(EnumSet.of(Days.MONDAY, Days.TUESDAY));

        EnumSet<Days> set2 = EnumSet.complementOf(set1);

       
        System.out.println(set1);
        System.out.println(set2);
        
    }
    
}
