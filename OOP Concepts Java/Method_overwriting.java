class Employee {
    protected String name;
    protected double hourlyRate;

    // Constructor
    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    // Method to calculate payment
    public double calculatePayment(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}

// FullTimeEmployee class - a specific type of employee
class FullTimeEmployee extends Employee {
    // Constructor
    public FullTimeEmployee(String name, double hourlyRate) {
        super(name, hourlyRate);
    }

    // Overriding the calculatePayment method for full-time employees
    @Override
    public double calculatePayment(int hoursWorked) {
        // Full-time employees get paid for 40 hours regardless of actual hours worked
        return 40 * hourlyRate;
    }
}

// PartTimeEmployee class - another specific type of employee
class PartTimeEmployee extends Employee {
    // Constructor
    public PartTimeEmployee(String name, double hourlyRate) {
        super(name, hourlyRate);
    }

    // No need to override calculatePayment method for part-time employees
}

// Contractor class - another specific type of employee
class Contractor extends Employee {
    // Constructor
    public Contractor(String name, double hourlyRate) {
        super(name, hourlyRate);
    }

    // Overriding the calculatePayment method for contractors
    @Override
    public double calculatePayment(int hoursWorked) {
        // Contractors get paid based on actual hours worked
        return super.calculatePayment(hoursWorked);
    }
}

public class Method_overwriting {
    public static void main(String[] args) {
        // Creating different types of employees
        Employee fullTimeEmployee = new FullTimeEmployee("John", 20.0);
        Employee partTimeEmployee = new PartTimeEmployee("Alice", 15.0);
        Employee contractor = new Contractor("Bob", 25.0);

        // Calculating payments for each employee
        double payment1 = fullTimeEmployee.calculatePayment(45); // Output will be 800.0
        double payment2 = partTimeEmployee.calculatePayment(20); // Output will be 300.0
        double payment3 = contractor.calculatePayment(30); // Output will be 750.0

        // Displaying payments
        System.out.println("Payment for full-time employee: $" + payment1);
        System.out.println("Payment for part-time employee: $" + payment2);
        System.out.println("Payment for contractor: $" + payment3);
    }
}