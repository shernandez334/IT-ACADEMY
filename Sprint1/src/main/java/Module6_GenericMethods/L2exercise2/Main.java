package Module6_GenericMethods.L2exercise2;

import Module6_GenericMethods.L1exercise2.GenericMethods;
import Module6_GenericMethods.L1exercise2.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Santiago", "Hernandez", 25);
        int age = 25;
        char c = 'a';
        GenericMethods.printGenericParameters(person1, age, c);
    }
}
