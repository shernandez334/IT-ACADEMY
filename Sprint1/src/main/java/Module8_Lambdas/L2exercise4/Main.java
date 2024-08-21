package Module8_Lambdas.L2exercise4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg){
        List<Object> randomList = new ArrayList<>();
        Collections.addAll(randomList, "euro", "eurovision", "uefa", 123, 1, 3, "america");
        System.out.println("Alphabetical Order: ");
        randomList.sort(Comparator.comparing(Object::toString));
        randomList.forEach(System.out::println);

        System.out.print("\nWords that start with 'e'" + "\n");
        randomList.sort(Comparator.comparing(obj -> obj.toString().startsWith("e")).reversed());
        randomList.forEach(System.out::println);

        System.out.println("\nReplace a with 4");
        randomList = randomList.stream()
                .map(o -> (Object) o.toString().replace('a', '4'))
                .toList();
        randomList.forEach(System.out::println);

        System.out.println("\nList with only numbers");
        List<Object> numberList = new ArrayList<>();
        Collections.addAll(numberList, "euro", "eurovision", "uefa", 123, 1, 3, "america");
        numberList = numberList.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
        numberList.forEach(System.out::println);
    }

}
