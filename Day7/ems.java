package Day7;

abstract class Employee {
    String name;
    int employeeId;

    // Constructor to initialize Employee details
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary
    abstract void calculateSalary();

    // Concrete method to show employee details
    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private final int salary = 50000; // Fixed salary

    // Constructor
    FullTimeEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    // Implementing abstract method
    @Override
    void calculateSalary() {
        showDetails();
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    int hoursWorked;
    private final int ratePerHour = 500;

    // Constructor
    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }

    // Implementing abstract method
    @Override
    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        showDetails();
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}

// Main class
public class ems {
    public static void main(String[] args) {
        // Creating FullTimeEmployee object
        Employee emp1 = new FullTimeEmployee("Ramya", 101);
        emp1.calculateSalary();

        // Creating PartTimeEmployee object
        Employee emp2 = new PartTimeEmployee("Sharmi", 102, 20); // 20 hours worked
        emp2.calculateSalary();
    }
}
