package Module7_Annotations.L1exercise2;

public class WorkerOnline extends Worker {
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

    @Deprecated
    public String deprecatedMethodWorkerOnline(){
        return "This method is deprecated for WorkerOnline.";
    }
}
