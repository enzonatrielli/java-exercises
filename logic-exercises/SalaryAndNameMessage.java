import java.util.Scanner;
import java.util.Locale;

public class SalaryAndNameMessage {

    public static void main(String[] args) {

        String name;
        double salary;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        name = sc.next();
        System.out.print("Salary: $ ");
        salary = sc.nextDouble();

        System.out.printf("The employee %s earns $ %.2f a month.", name, salary);

        sc.close();
    }
}
