package Module6_GenericMethods.L2exercise2;

public class GenericMethods {

    @SafeVarargs
    public static <T> void printGenericParameters(T... args){
        for (T arg: args){
            System.out.println(arg);
        }
    }
}
