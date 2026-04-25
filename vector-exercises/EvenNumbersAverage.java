import java.util.Locale;
import java.util.Scanner;

public class EvenNumbersAverage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double average = 0.00;
        int evenQuantity = 0;

        System.out.print("Quantity of vector elements: ");
        int quantity = sc.nextInt();
        int[] evenNumbers = new int[quantity];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Type a number: ");
            evenNumbers[i] = sc.nextInt();
            if (evenNumbers[i] % 2 == 0) {
                average += evenNumbers[i];
                evenQuantity += 1;
            }
        }

        average /= evenQuantity;

        if (evenQuantity != 0) {
            System.out.printf("EVEN NUMBERS AVERAGE = %.1f", average);
        }
        else {
            System.out.print("No even number inserted.");
        }

        sc.close();
    }
}
