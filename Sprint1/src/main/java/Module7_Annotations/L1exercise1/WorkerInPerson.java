package Module7_Annotations.L1exercise1;

public class WorkerInPerson extends Worker{
    private final int priceOfGasoline = 200;

    public WorkerInPerson(String firstName, String surname, double pricePerHour){
        super(firstName, surname, pricePerHour);
    }

    @Override
    public String calculateSalary(int workingHours){
        double salary;
        salary = (workingHours * super.getPricePerHour()) + this.priceOfGasoline;
        return "The total salary is: " + salary;
    }
}
