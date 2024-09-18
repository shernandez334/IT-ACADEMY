package Module7_Annotations.L1exercise1;

public class WorkerOnline extends Worker{
    private final int priceOfInternet = 25;

    public WorkerOnline(String firstName, String surname, double pricePerHour){
        super(firstName, surname, pricePerHour);
    }

    @Override
    public String calculateSalary(int workingHours){
        double salary;
        salary = (workingHours * super.getPricePerHour()) + this.priceOfInternet;
        return "The total salary is: " + salary;
    }
}
