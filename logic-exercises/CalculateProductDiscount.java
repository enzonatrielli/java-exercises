import java.util.Locale;
import java.util.Scanner;

public class CalculateProductDiscount {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Product price: $ ");
        double price = sc.nextDouble();
        double finalPrice = price - (price * 0.05);

        System.out.printf("Price with discount (5%%) = %.2f", finalPrice);

        sc.close();
    }
}
