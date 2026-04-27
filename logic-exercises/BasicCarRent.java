import java.util.Locale;
import java.util.Scanner;

public class BasicCarRent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Kilometers traveled: ");
        int km = sc.nextInt();
        System.out.print("Rented days: ");
        int days = sc.nextInt();

        double totalPrice = (90 * days) + (km * 0.20);

        System.out.printf("Total price to pay: $%.2f", totalPrice);

        sc.close();

    }
}
