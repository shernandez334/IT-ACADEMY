package Java_Collections.L1exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month>months = new ArrayList<Month>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (Month month: months){
            System.out.println(month.getName());
        }

        System.out.println();
        System.out.println("Arraylist Number of objects: " + months.size());
        System.out.println();

        HashSet<Month> monthSet = new HashSet<>(months);
        monthSet.add(new Month("October"));
        monthSet.add(new Month("January"));
        System.out.println("HashList Number of objects: " + monthSet.size() + "\n");

        Iterator<Month> iterator = months.iterator();
        System.out.println("Months printed with an iterator: " );
        while (iterator.hasNext()){
            Month month = iterator.next();
            System.out.println(month.getName());
        }
    }
}

