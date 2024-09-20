package Module7_Annotations.L1exercise1;

public class Worker {
    private String firstName;
    private String surname;
    private final double pricePerHour;

    public Worker(String firstName, String surname, double pricePerHour){
        this.firstName = firstName;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour(){
        return this.pricePerHour;
    }

    public double calculateSalary(int workingHours){
        return (workingHours * this.pricePerHour);
    }
}
