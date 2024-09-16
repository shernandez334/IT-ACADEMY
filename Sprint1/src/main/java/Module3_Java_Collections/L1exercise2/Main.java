package Module3_Java_Collections.L1exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("NUMBER'S LIST");
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Add Numbers [1, 2, 3] to the list.");
        Collections.addAll(numbers, 1, 2, 3);
        System.out.println("Print numbers");
        for (Integer number : numbers){
            System.out.println(number);
        }
        System.out.println();

        System.out.println("INVERSE NUMBER'S LIST");
        System.out.println("Create inverse number's list");
        List<Integer> inverseNumbs = new ArrayList<Integer>();
        System.out.println("Create iterators list to iterate the number's list in reverse.");
        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
        System.out.println("Iterate the list in reverse.");
        while (numbersIterator.hasPrevious()){
            inverseNumbs.add(numbersIterator.previous());
        }
        System.out.println("Print numbers");
        for (Integer number : inverseNumbs){
            System.out.println(number);
        }
    }
}