package EnumSet;

import java.util.EnumSet;

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public abstract class EnumSetDemo5 {

    public static void main(String[] args) {

        EnumSet<Months> set1 = EnumSet.allOf(Months.class);

        EnumSet<Months> set2 = EnumSet.copyOf(set1);

        System.out.println(set1);
        System.out.println(set2);

    }

}
