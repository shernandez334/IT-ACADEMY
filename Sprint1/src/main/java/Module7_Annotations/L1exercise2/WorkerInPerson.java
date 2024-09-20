package Module7_Annotations.L1exercise2;

public class WorkerInPerson extends Worker {
    private static final int priceOfGasoline = 200;

    public WorkerInPerson(String firstName, String surname, double pricePerHour){
        super(firstName, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int workingHours) {
        return super.calculateSalary(workingHours) + priceOfGasoline;
    }

    @Deprecated
    public String deprecatedMethodWorkerInPerson(){
        return "This method is deprecated for WorkerInPerson.";
    }
}
