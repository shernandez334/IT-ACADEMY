package Module7_Annotations;

public class WorkerOnline extends Worker{
    private double priceOfInternet;

    public WorkerOnline(String firstName, String surname, double pricePerHour, double priceOfInternet){
        super(firstName, surname, pricePerHour);
        this.priceOfInternet = priceOfInternet;
    }

    @Override
    public String calculateSalary(int workingHours){
        double salary;
        salary = (workingHours * super.getPricePerHour()) + this.priceOfInternet;
        return "The total salary is: " + salary;
    }
}
