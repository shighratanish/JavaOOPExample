abstract class Employee {
    String name;
    int id;
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();  // Abstract method
}

class PermanentEmployee extends Employee {
    double bonus;

    PermanentEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class ContractualEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    ContractualEmployee(String name, int id, double baseSalary, int hoursWorked, double ratePerHour) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (hoursWorked * ratePerHour);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Ravi", 101, 30000, 5000);
        Employee e2 = new ContractualEmployee("Amit", 102, 10000, 100, 200);
        System.out.println("Permanent Salary: " + e1.calculateSalary());
        System.out.println("Contractual Salary: " + e2.calculateSalary());
    }
}
