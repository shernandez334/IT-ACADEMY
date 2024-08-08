package Module6_GenericMethods.L2exercise1;
import Module6_GenericMethods.L1exercise2.Person;

import static Module6_GenericMethods.L1exercise2.GenericMethods.printGenericParameters;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Santiago", "Hernandez", 25);
        int age = 25;
        char c = 'a';
        printGenericParameters(person1, age, c);
    }
}
