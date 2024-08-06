package Module7_Annotations.L1exercise1;

public class Worker {
    private String firstName;
    private String surname;
    private double pricePerHour;
    public Worker(String firstName, String surname, double pricePerHour){
        this.firstName = firstName;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour(){
        return this.pricePerHour;
    }

    public String calculateSalary(int workingHours){
        return "";
    }
}
