package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: $ ");
            double salary = sc.nextDouble();
            sc.nextLine();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Employee result = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
        if (result != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            result.increaseSalary(percentage);
        }
        else {
            System.out.print("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : list) {
            System.out.print(employee);
        }

        sc.close();
    }
}