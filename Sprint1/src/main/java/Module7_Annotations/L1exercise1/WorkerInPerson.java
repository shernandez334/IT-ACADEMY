package Module7_Annotations.L1exercise1;

public class WorkerInPerson extends Worker{
    private static double priceOfGasoline;

    public WorkerInPerson(String firstName, String surname, double pricePerHour, double priceOfGasoline){
        super(firstName, surname, pricePerHour);
        this.priceOfGasoline = priceOfGasoline;
    }

    @Override
    public String calculateSalary(int workingHours){
        double salary;
        salary = (workingHours * super.getPricePerHour()) + priceOfGasoline;
        return "The total salary is: " + salary;
    }
}
