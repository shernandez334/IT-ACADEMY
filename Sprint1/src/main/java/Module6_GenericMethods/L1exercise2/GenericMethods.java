package Module6_GenericMethods.L1exercise2;

public class GenericMethods{
    public static <T> void printGenericParameters(T arg1, T arg2, T arg3){
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
