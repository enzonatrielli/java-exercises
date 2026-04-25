import java.util.Locale;
import java.util.Scanner;

public class RealToDollarConverter {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double moneyAmount, dollarPrice = 4.95, dollarsAmount;

        System.out.print("Real value: R$ ");
        moneyAmount = sc.nextDouble();

        dollarsAmount = moneyAmount / dollarPrice;

        System.out.printf("You can buy $ %.2f dollars.", dollarsAmount);

        sc.close();
    }
}
