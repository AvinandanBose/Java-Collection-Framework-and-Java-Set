package EnumSet;

import java.util.EnumSet;

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumSetDemo7 {

    public static void main(String[] args) {                           
        EnumSet<Months> set1 = EnumSet.noneOf(Months.class);
        System.out.println(set1);
    }
    
}
