import java.util.Scanner;
import java.util.Locale;

public class CartesianPlane {

    public static void main(String[] args) {

        String quadrant = "";
        float x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("X = ");
        x = sc.nextFloat();
        System.out.print("Y = ");
        y = sc.nextFloat();

        if (x == 0 || y == 0) {
            if (x > y) {
                quadrant = "Axius X";
            }
            else if (y > x) {
                quadrant = "Axius Y";
            }
            else {
                quadrant = "Origin";
            }
        }
        else {
            if (x > 0 && y > 0) {
                quadrant = "Q1";
            }
            else if (x < 0 && y > 0) {
                quadrant = "Q2";
            }
            else if (x < 0 && y < 0) {
                quadrant = "Q3";
            }
            else if (x > 0 && y < 0) {
                quadrant = "Q4";
            }
        }

        System.out.println(quadrant);
    }
}