package Module8_Lambdas.L2exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg){
        List<Integer> numList = Arrays.asList(3, 55, 44);
        filterNumbers(numList);
    }

    public static void filterNumbers(List<Integer> numList){
            String strList = numList.stream()
                .map(n -> (n % 2 == 0? "e" : "o") + n)
                .collect(Collectors.joining(", "));
            System.out.println(strList);
    }
}
