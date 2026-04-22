import java.util.Scanner;
import java.util.Locale;

public class DifferentWeightTestsAverage {

    public static void main(String[] args) {

        int n;
        double number1, number2, number3, average;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many test cases? ");
        n = sc.nextInt();

        for (int i=1; i <= n; i++) {
            System.out.printf("Test case [%d].", i);
            System.out.println();
            System.out.print("Number 1: ");
            number1 = sc.nextDouble();
            System.out.print("Number 2: ");
            number2 = sc.nextDouble();
            System.out.print("Number 3: ");
            number3 = sc.nextDouble();
            average = (number1 * 2.0 + number2 * 3.0 + number3 * 5.0) / 10.0;
            System.out.printf("Average of test case [%d]: %.1f", i, average);
            System.out.println();
        }

        sc.close();

    }
}