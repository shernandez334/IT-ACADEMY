package Module1.L1exercise2;

public class Car {
    private static final String brand = "Ferrari";
    private static String model;
    private final double horsePower = 500;

    public Car(){
        model = "Testarossa";
    }

    public static String brake(){
        return "The vehicle is braking.";
    }

    public String accelerate() {
        return "The vehicle is accelerating.";
    }
}
