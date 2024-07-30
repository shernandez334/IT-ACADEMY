package Module2_Exceptions.L1exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers){
            System.out.println(number);
        }
        System.out.println();

        List<Integer> inverseNumbs = new ArrayList<Integer>();
        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
        while (numbersIterator.hasPrevious()){
            inverseNumbs.add(numbersIterator.previous());
        }

        for (Integer number : inverseNumbs){
            System.out.println(number);
        }
    }
}
