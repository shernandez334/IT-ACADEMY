package Module7_Annotations.L1exercise2;

public class DeprecatedMethods {
    @SuppressWarnings("deprecation")
    public String printDeprecatedMethods(){
        WorkerInPerson worker1 = new WorkerInPerson("Santiago", "Hernandez", 35);
        WorkerOnline worker2 = new WorkerOnline("Ivan", "Hernandez", 33);

        return worker1.deprecatedMethodWorkerInPerson() +
                worker2.deprecatedMethodWorkerOnline();
    }
}
