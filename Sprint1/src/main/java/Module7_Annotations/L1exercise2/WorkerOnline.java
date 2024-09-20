package Module7_Annotations.L1exercise2;

public class WorkerOnline extends Worker {
    private static final int priceOfInternet = 25;

    public WorkerOnline(String firstName, String surname, double pricePerHour){
        super(firstName, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int workingHours){
        return super.calculateSalary(workingHours) + priceOfInternet;
    }

    @Deprecated
    public String deprecatedMethodWorkerOnline(){
        return "This method is deprecated for WorkerOnline.";
    }
}
