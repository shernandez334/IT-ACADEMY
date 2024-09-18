package Module6_GenericMethods.L1exercise2;

public class Person <T>{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Arg1: " + this.name + "\n"
            + "Arg2: " + this.surname + "\n"
                + "Arg3: " + this.age + "\n";
    }
}
