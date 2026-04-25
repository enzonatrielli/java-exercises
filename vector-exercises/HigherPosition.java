import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numbers to insert: ");
        int quantity = sc.nextInt();
        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number: ");
            numbers[i] = sc.nextDouble();
        }

        double higherNumber = numbers[0];
        int positionHigherNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > higherNumber) {
                higherNumber = numbers[i];
                positionHigherNumber = i;
            }
        }

        System.out.println();
        System.out.printf("HIGHER VALUE = %.1f", higherNumber);
        System.out.println();
        System.out.printf("HIGHER VALUE POSITION = %d", positionHigherNumber);

        sc.close();
    }
}
