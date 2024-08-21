package Module6_GenericMethods.L2exercise1;

public class GenericMethods{
    public static <T> void printGenericParameters(Person arg1, T arg2, T arg3){
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
