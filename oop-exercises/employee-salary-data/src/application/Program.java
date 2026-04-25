package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine().toUpperCase();

        System.out.print("Gross salary: $ ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: $ ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        sc.close();
    }
}
