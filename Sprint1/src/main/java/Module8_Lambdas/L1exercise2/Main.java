package Module8_Lambdas.L1exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, "Hola", "Como", "estabas", "hoy");
        wordsList.stream()
                .filter(words -> words.contains("o") && words.length() > 5)
                .forEach(System.out::println);
    }
}
