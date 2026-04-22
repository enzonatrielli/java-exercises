import java.util.Locale;
import java.util.Scanner;

public class GradesAverage {

    public static void main(String[] args) {

        double grade1, grade2, average;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Grade 1: ");
        grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        grade2 = sc.nextDouble();

        average = (grade1 + grade2) / 2;

        System.out.printf("The average between grades %.2f and %.2f = %.2f", grade1, grade2, average);

        sc.close();
    }
}
