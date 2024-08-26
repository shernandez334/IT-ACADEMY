package Module1.L2exercise1;

public class Telephone {
    private String brand;
    private String model;

    public Telephone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String call(String number){
        return "You are calling the number: " + number + "\n";
    }
}
