package Module7_Annotations.L1exercise1;

public class Main {
    public static void main(String[] args) {
        WorkerInPerson worker1 = new WorkerInPerson("Santiago", "Hernandez", 35, 50);
        System.out.println(worker1.calculateSalary(50));

        WorkerOnline worker2 = new WorkerOnline("Ivan", "Hernandez", 33, 30);
        System.out.println(worker2.calculateSalary(50));
    }
}
