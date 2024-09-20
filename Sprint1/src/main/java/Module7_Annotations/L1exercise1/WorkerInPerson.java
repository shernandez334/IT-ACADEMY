package Module7_Annotations.L1exercise1;

public class WorkerInPerson extends Worker{
    private final static int priceOfGasoline = 200;

    public WorkerInPerson(String firstName, String surname, double pricePerHour){
        super(firstName, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int workingHours){
        return super.calculateSalary(workingHours) + priceOfGasoline;
    }
}
