package Module8_Lambdas.L1exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, "Hola", "Ola", "hello", "hoy");
        wordsList.stream()
                .filter(words -> words.toLowerCase().contains("o"))
                .forEach(System.out::println);
    }
}
