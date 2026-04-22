import java.util.Scanner;
import java.util.Locale;

public class TotalPerFoodUnit {

    public static void main(String[] args) {

        String name;
        int code, units;
        double total;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        total = 0;
        name = "";

        System.out.print("Item code: ");
        code = sc.nextInt();
        System.out.print("Unit(s): ");
        units = sc.nextInt();

        if (code == 1) {
            name = "Hot-dog";
            total = 4 * units;
        }
        else if (code == 2) {
            name = "X-Salad";
            total = 4.50 * units;
        }
        else if (code == 3) {
            name = "X-Bacon";
            total = 5 * units;
        }
        else if (code == 4) {
            name = "Simple toast";
            total = 2 * units;
        }
        else if (code == 5) {
            name = "Soda";
            total = 1.50 * units;
        }
        else {
            System.out.println("Error! Code doesn't match any item!");
        }
        System.out.printf("Total: $ %.2f for %d %s.", total, units, name);
        sc.close();
    }
}