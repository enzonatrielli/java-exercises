import java.util.Scanner;
import java.util.Locale;

public class TotalProductsPayment {

    public static void main(String[] args){

        int code, pieces;
        double unity, total1, total2, result;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // First
        System.out.print("[1] - Code: ");
        code = sc.nextInt();
        System.out.print("[1] - Pieces: ");
        pieces = sc.nextInt();
        System.out.print("[1] - Unity value: $ ");
        unity = sc.nextDouble();
        total1 = pieces * unity;

        // Second
        System.out.println();
        System.out.print("[2] - Code: ");
        code = sc.nextInt();
        System.out.print("[2] - Pieces: ");
        pieces = sc.nextInt();
        System.out.print("[2] - Unity value: $ ");
        unity = sc.nextDouble();
        total2 = pieces * unity;

        result = total1 + total2;

        System.out.println();
        System.out.printf("TOTAL TO PAY: $ %.2f", result);

        sc.close();
    }
}