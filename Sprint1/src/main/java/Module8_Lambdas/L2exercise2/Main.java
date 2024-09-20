package Module8_Lambdas.L2exercise2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<Integer> numList = Arrays.asList(3, 55, 44);
        filterNumbers(numList);
    }

    public static void filterNumbers(List<Integer> numList){
        numList.stream()
                .filter(n -> (n % 2) != 0)
                .map(String::valueOf)
                .map(s -> "o" + s)
                .forEach(System.out::println);
        numList.stream()
                .filter(n -> (n % 2) == 0)
                .map(String::valueOf)
                .map(s -> "e" + s)
                .forEach(System.out::println);
    }
}
