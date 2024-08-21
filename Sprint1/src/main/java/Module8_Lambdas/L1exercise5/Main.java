package Module8_Lambdas.L1exercise5;

public class Main {
    public static void main(String[] arg){

        GetValue pi = () ->3.1415d;
        System.out.println(pi.getPiValue());
    }

}
