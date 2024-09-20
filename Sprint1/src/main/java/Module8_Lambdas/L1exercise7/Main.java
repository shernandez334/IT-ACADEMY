package Module8_Lambdas.L1exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] arg){
        ArrayList<Object> objList = new ArrayList<Object>();
        Collections.addAll(objList, 2, 4, 6, "hello", "how", "areYou");
        objList.stream()
                .filter(obj -> obj instanceof String)
                .map(String::valueOf)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}
