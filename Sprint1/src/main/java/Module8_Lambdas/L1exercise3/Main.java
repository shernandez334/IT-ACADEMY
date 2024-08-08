package Module8_Lambdas.L1exercise3;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        String[] months = new DateFormatSymbols().getMonths();
        List<String> monthsList = new ArrayList<>(Arrays.asList(months));
        monthsList.forEach(System.out::println);
    }
}
