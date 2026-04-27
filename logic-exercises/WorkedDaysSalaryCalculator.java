import java.util.Locale;
import java.util.Scanner;

public class WorkedDaysSalaryCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Worked days per month: ");
        int days = sc.nextInt();
        double totalSalary = 8 * days * 25;

        System.out.printf("Your salary will be $%.2f", totalSalary);

        sc.close();
    }
}
