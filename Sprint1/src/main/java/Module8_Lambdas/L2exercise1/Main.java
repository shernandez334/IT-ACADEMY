package Module8_Lambdas.L2exercise1;


import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg){

        List<String> nameList = Arrays.asList("Santiago de Compostela", "Barcelona", "Madrid", "Andorra", "Ana");
        filterList(nameList);
    }
    public static List<String> filterList(List<String> nameList){
        List<String> nameListModified = nameList.stream()
                .filter(objs -> objs.charAt(0) == 'A' && objs.length() == 3)
                        .toList();

        nameListModified.forEach(System.out::println);

        return nameListModified;
    }
}
