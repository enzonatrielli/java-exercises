import java.util.Locale;
import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double average = 0;

        System.out.print("How many elements will the vector contain: ");
        int quantity = sc.nextInt();
        double[] vect = new double[quantity];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Number [%d]: ", i+1);
            vect[i] = sc.nextDouble();
            average += vect[i];
        }

        average /= vect.length;

        System.out.println();
        System.out.printf("Vector average: %.3f", average);
        System.out.println();
        System.out.print("Elements above average: ");
        System.out.println();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < average) {
                System.out.print(vect[i] + " ");
            }
        }

        sc.close();
    }
}
