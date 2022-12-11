package EnumSet;

import java.util.EnumSet;
enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class EnumSetDemo6 {
    public static void main(String[] args) {

        EnumSet<Months> set1 = EnumSet.range(Months.APRIL , Months.NOVEMBER);                               

        

        System.out.println(set1);
        

    }
}
