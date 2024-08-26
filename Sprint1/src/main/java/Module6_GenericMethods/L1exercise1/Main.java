package Module6_GenericMethods.L1exercise1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods instance = new NoGenericMethods("First", "Second", "Third");
        System.out.println("Arg1: " + instance.getArg1());
        System.out.println("Arg2: " + instance.getArg2());
        System.out.println("Arg3: " + instance.getArg3());

        instance.setArg1("NewFirst");
        instance.setArg2("NewSecond");
        instance.setArg3("NewThird");

        System.out.println("Arg1: " + instance.getArg1());
        System.out.println("Arg2: " + instance.getArg2());
        System.out.println("Arg3: " + instance.getArg3());
    }
}
