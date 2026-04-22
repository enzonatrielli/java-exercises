import java.util.Scanner;
import java.util.Locale;

public class NumbersDivision {

    public static void main(String[] args) {

        int totalDivisions, dividend, divisor;
        double result;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many divisions? ");
        totalDivisions = sc.nextInt();

        for (int i = 1; i <= totalDivisions; i++) {
            System.out.println("Division " + i);
            System.out.print("Number 1: ");
            dividend = sc.nextInt();
            System.out.print("Number 2: ");
            divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Impossible division.");
            }
            else {
                result = (double) dividend / divisor;
                System.out.printf("Result: %.2f.", result);
            }
        }

        sc.close();
    }
}
