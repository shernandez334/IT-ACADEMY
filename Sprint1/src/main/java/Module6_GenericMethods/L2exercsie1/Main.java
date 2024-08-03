package Module6_GenericMethods.L2exercsie1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Santiago", "Hernandez", 25);
        Person person2 = new Person("Ivan", "Hernandez", 58);
        Person person3 = new Person("Mar", "Becerra", 55);
        GenericMethods.printGenericParameters(person1, person2, person3);
    }
}
