import java.util.Scanner;
import java.util.Locale;

public class EmployeeTotalSalary {

    public static void main(String[] args){

        int number, hours;
        double per_hour, salary;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee number: ");
        number = sc.nextInt();

        System.out.print("Worked hours: ");
        hours = sc.nextInt();

        System.out.print("Value per hour: ");
        per_hour = sc.nextDouble();

        salary = hours * per_hour;

        System.out.println();
        System.out.printf("NUMBER = %d", number);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();
    }
}