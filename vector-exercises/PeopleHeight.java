import java.util.Locale;
import java.util.Scanner;

public class PeopleHeight {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double heightSum = 0.00;
        double minorPeople = 0;

        System.out.print("How many people do you want to insert: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        String[] name = new String [quantity];
        int[] age = new int [quantity];
        double[] height = new double [quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Data of person [%d]:%n", i+1);

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
            heightSum += height[i];
            sc.nextLine();

            System.out.println();

            if (age[i] < 16) {
                minorPeople += 1;
            }
        }

        double average = heightSum / height.length;
        minorPeople = minorPeople / age.length * 100;

        System.out.printf("Average height: %.2f %n", average);
        System.out.printf("People minor than 16 years: %.1f%% - ", minorPeople);
        for (int i=0; i < name.length; i++) {
            if (age[i] < 16) {
                System.out.printf("%s ", name[i]);
            }
        }

        sc.close();

    }
}
