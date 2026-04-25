import java.util.Locale;
import java.util.Scanner;

public class PeopleData {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double tallest = 0, shortest = 0, womenAverage = 0;
        int men = 0, women = 0;

        System.out.print("How many people to insert: ");
        int quantity = sc.nextInt();
        double[] height = new double[quantity];
        char[] sex = new char[quantity];

        for (int i = 0; i < height.length; i++) {
            System.out.printf("Person %d - Height: ", i+1);
            height[i] = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Person %d - Sex (M / F): ", i+1);
            sex[i] = sc.next().toUpperCase().charAt(0);
            if (i == 0) {
                tallest = height[i];
                shortest = height[i];
            }
            else {
                if (height[i] > tallest) {
                    tallest = height[i];
                }
                else if (height[i] < shortest) {
                    shortest = height[i];
                }
            }
            if (sex[i] == 'M') {
                men += 1;
            }
            else if (sex[i] == 'F'){
                women += 1;
                womenAverage += height[i];
            }
        }

        womenAverage /= women;

        System.out.println();
        System.out.printf("Shortest height: %.2f", shortest);
        System.out.println();
        System.out.printf("Highest height: %.2f", tallest);
        System.out.println();
        System.out.printf("Women height average = %.2f", womenAverage);
        System.out.println();
        System.out.printf("Men number: %d", men);

        sc.close();
    }
}
