import java.util.Locale;
import java.util.Scanner;

public class GetDeltaValue {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the A value: ");
        double a = sc.nextDouble();
        System.out.print("Enter the B value: ");
        double b = sc.nextDouble();
        System.out.print("Enter the C value: ");
        double c = sc.nextDouble();

        double delta = b*b - 4 * a * c;

        System.out.printf("Delta = %.2f", delta);

        sc.close();
    }
}
