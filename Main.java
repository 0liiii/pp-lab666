import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ewa", 2500.0, 1);
        Worker worker2 = new Worker("Adam", 2200.0, 2);
        Worker worker3 = new Worker("Justyna", 2300.0, 3);
        Worker worker4 = new Worker("Emil", 2400.0, 4);

        Manager manager = new Manager("Michael", 5000.0, 100);

        System.out.println("Salary of " + worker1.getName() + ": " + worker1.getSalary());
        worker1.work();
        System.out.println("Salary of " + worker2.getName() + ": " + worker2.getSalary());
        worker2.work();
        System.out.println("Salary of " + worker3.getName() + ": " + worker3.getSalary());
        worker3.work();
        System.out.println("Salary of " + worker4.getName() + ": " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}
