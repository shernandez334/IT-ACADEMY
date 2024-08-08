package Module8_Lambdas.L1exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class Main {
    public static void main (String[] args){
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, "Hola", "Como", "estas", "hoy");
        wordsList.stream()
                .filter(words -> words.contains("o"))
                .forEach(System.out::println);
    }
}
