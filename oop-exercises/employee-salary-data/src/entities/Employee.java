package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    // Methods

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double updatedSalary = grossSalary + (grossSalary * (percentage / 100)) - tax;
        System.out.printf("Updated data: %s, $ %.2f", name, updatedSalary);
    }

    public String toString() {
        return String.format("Employee: %s, $ %.2f", name, netSalary());
    }
}
