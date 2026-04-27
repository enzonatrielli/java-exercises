import java.util.Locale;
import java.util.Scanner;

public class CalculateNewSalary {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial salary: $ ");
        double salary = sc.nextDouble();
        double newSalary = salary + (salary * 0.15);

        System.out.printf("Increased salary (15%%) = $ %.2f", newSalary);

        sc.close();
    }
}
