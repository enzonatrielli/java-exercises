import java.util.Locale;
import java.util.Scanner;

public class DoubleAndThirdPart {

    public static void main(String[] args) {

        double number, numberDouble, thirdPart;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        number = sc.nextDouble();
        numberDouble = number * 2;
        thirdPart = number / 3;

        System.out.printf("Number: %.1f | Double: %.1f | Third part: %.2f.", number, numberDouble, thirdPart);

        sc.close();
    }
}
