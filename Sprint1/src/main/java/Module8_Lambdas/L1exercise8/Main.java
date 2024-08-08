package Module8_Lambdas.L1exercise8;

public class Main {
    public static void main(String[] arg){
        Functional wordReverse = (text) ->new StringBuilder(text).reverse().toString();

        System.out.println(wordReverse.reverse("Hello"));
    }
}
