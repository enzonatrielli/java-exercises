import java.util.Locale;
import java.util.Scanner;

public class VectorSumAndAverage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;

        System.out.print("How many numbers are you going to insert? ");
        int numbers = sc.nextInt();
        double[] vect = new double[numbers];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Number: ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double average = sum / vect.length;

        System.out.print("Values = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f ", vect[i]);
        }

        System.out.printf("%nSum = %.2f%n", sum);
        System.out.printf("Average = %.2f", average);

        sc.close();

    }
}
