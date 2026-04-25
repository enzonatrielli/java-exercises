import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ApprovedStudents {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PASS_AVERAGE = 6.00;

        System.out.print("Students quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        String[] name = new String[quantity];
        double[] grade1 = new double[quantity];
        double[] grade2 = new double[quantity];

        for (int i = 0; i < name.length; i++){
            System.out.printf("Student %d", i+1);
            System.out.println();
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Grade 1: ");
            grade1[i] = sc.nextDouble();
            System.out.print("Grade 2: ");
            grade2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Approved Students:");
        for (int i = 0; i < name.length; i++) {
            if ((grade1[i] + grade2[i]) / 2 >= PASS_AVERAGE) {
                System.out.print(name[i] + " | ");
            }
        }

        sc.close();
    }
}
