package EnumSet;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.TreeSet;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
public class EnumSetDemo {

    
    
    public static void main(String[] args) {
        EnumSet<Days> set1 = EnumSet.allOf(Days.class);
        HashSet<Months> set2 = new HashSet<>();
        TreeSet<Days> set3 = new TreeSet<>();
        set2.add(Months.JANUARY);
        set3.addAll(set1);
        System.out.println(set2);
        System.out.println(set3);

        
    }
}

  
