package Module1.L2exercise1;

public class Main {
    public static void main(String[] args) {
    Smartphone phone1 = new Smartphone("Apple", "15");
    System.out.println(phone1.alarm());
    System.out.println(phone1.photograph());
    System.out.println(phone1.call("123 456 7890."));
    }
}
