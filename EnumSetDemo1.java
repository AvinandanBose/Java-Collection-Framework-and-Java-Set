package EnumSet;

import java.util.EnumSet;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumSetDemo1 {
    public static void main(String[] args) {
        EnumSet<Days> set = EnumSet.of(Days.MONDAY, Days.TUESDAY);
        
        
        System.out.println(set);
       
    }

}
