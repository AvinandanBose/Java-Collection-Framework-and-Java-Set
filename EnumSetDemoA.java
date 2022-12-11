package EnumSet;

import java.util.EnumSet;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;


enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class EnumSetDemoA {

    public static void main(String[] args) {
        EnumSet<Days> set1 = EnumSet.of(Days.MONDAY, Days.TUESDAY);
        EnumSet<Days> set2 = EnumSet.allOf(Days.class);

        EnumSet<Days> CloneOfset1;

        try {

            // Add

            set1.add(Days.SUNDAY);
            set1.add(Days.WEDNESDAY);
            set1.add(Days.THURSDAY);
            set1.add(Days.FRIDAY);
            set1.add(Days.SATURDAY);
            System.out.println(set1);

            // Remove

            set1.remove(Days.SUNDAY);
            System.out.println(set1);

            // Clear

            set1.clear();
            System.out.println(set1);

            // Clone

            CloneOfset1 = (EnumSet<Days>) set2.clone();
            System.out.println(CloneOfset1);

            // Iterator
            Iterator<Days> iterator = set2.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // CompareTo
            EnumSet<Days> set3 = EnumSet.of(Days.SUNDAY, Days.MONDAY);
            EnumSet<Days> set4 = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
            try {
                Iterator<Days> iterator1 = set3.iterator();
                Iterator<Days> iterator2 = set4.iterator();
                while (iterator1.hasNext() && iterator2.hasNext()) {
                    int comparison = iterator1.next().compareTo(iterator2.next());
                    System.out.println(comparison);
                }
            }

            // Note: CompareTo must be of Same Type
            // Days.SUNDAY = 0 , Days.Tuesday = 2 . Hence, Comparison: 0 - 2 = -2.
            // Days.Monday = 1 , Days.Wednesday = 3 . Hence, Comparison: 1 - 3 = -2.

            catch (Exception e) {
                System.out.println("Exception");

            }

            // Remove

            try {
                Iterator<Days> iterator3 = set2.iterator();
                Enum<Days> s;
                while (iterator3.hasNext()) {
                    s = iterator3.next();
                    if (s.equals(Days.SUNDAY)) {
                        iterator3.remove();
                    }
                }
                System.out.println(set2);
            } catch (Exception e) {
                System.out.println("Exception");
            }

            // AddAll
            set1.addAll(set2);

            System.out.println(set1);

            System.out.println(" ");

            // RetainAll
            set2.retainAll(set1);
            System.out.println(set2);

            System.out.println(" ");

            //Spliterator
            Spliterator<Days> days = set2.spliterator();
            days.forEachRemaining((n) -> System.out.println("Day:" + n));

            System.out.println(" ");

            // Contains
            Boolean b  = set2.contains(Days.MONDAY);
            System.out.println(b);

            System.out.println(" ");

            //Size
            System.out.println(set2.size());

            System.out.println(" ");

            //IsEmpty
            boolean c = set2.isEmpty();
            System.out.println(c);

            System.out.println(" ");


            // java.util.AbstractCollection
            //ContainsAll
            Boolean d = set2.containsAll(set1);

            System.out.println(d);

            System.out.println(" ");

            //toString
            String s = set2.toString();
            System.out.println(s);



            // java.util.AbstractSet

            //RemoveAll
            EnumSet<Days> set5 = EnumSet.of(Days.WEDNESDAY, Days.MONDAY);

            set2.removeAll(set5);
            System.out.println(set2);
            System.out.println(" ");

            //Equals
            Boolean e = set2.equals(set1);
            System.out.println(e);

            //HashCode
            int f = set2.hashCode();
            System.out.println(f);

            // java.util.Collection
            //RemoveIf
            Predicate<Days> pr = a -> set2.contains(Days.FRIDAY);
            set2.removeIf(pr);
            System.out.println(set2);// Deletes upto Days.FRIDAY

            
            set1.removeIf(a -> (set1.contains(Days.TUESDAY)==true));
            System.out.println(set1);//Deletes upto Days.TUESDAY

            //Stream

            System.out.println(" ");

            set1.stream().forEach(System.out::println);
            System.out.println(" ");
        

            //ParallelStream
            set1.parallelStream().forEach(System.out::println);
            System.out.println(" ");



            // java.util.AbstractCollection
            //toArray
            System.out.println(" ");
            Object[] arr = set1.toArray();
            for (Object o : arr) {
                System.out.println(o);
            }




        } catch (Exception e) {

            System.out.println("Exception");
        }

    }
}
