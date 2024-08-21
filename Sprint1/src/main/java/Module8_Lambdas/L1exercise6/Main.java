package Module8_Lambdas.L1exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] arg){
        ArrayList<Object> objList = new ArrayList<Object>();
        Collections.addAll(objList, 2, 4, 6, "hello", "how", "areYou");
        objList.sort(Comparator.comparing(obj -> obj.toString().length()));

        for(Object obj: objList){
            System.out.println(obj);
        }
    }
}
