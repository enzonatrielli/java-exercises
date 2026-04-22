import java.util.Scanner;
import java.util.Locale;

public class CalculateSalaryTax {

    public static void main(String[] args) {

        double salary, tax;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        tax = 0;

        System.out.print("Salary: ");
        salary = sc.nextFloat();

        if (salary <= 2000) {
            tax = 0;
        }
        else if (salary <= 3000) {
            tax = (salary - 2000) * 0.08;
        }
        else if (salary <= 4500) {
            tax = (salary - 3000) * 0.18 + 1000 * 0.08;
        }
        else if (salary > 4500) {
            tax = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (tax == 0) {
            System.out.println("Isent");
        }
        else {
            System.out.printf("$ %.2f", tax);
        }

        sc.close();
    }
}