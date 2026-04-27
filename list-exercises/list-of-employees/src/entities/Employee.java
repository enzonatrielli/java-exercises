package entities;

public class Employee {

    private final Integer ID;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public String toString() {
        return String.format("%n%d, %s, %.2f", ID, name, salary);
    }
}
