import java.util.Scanner;
import java.util.Locale;

public class AreaPerRadius {

    public static void main(String[] args){

        double radius, area;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the radius value: ");
        radius = sc.nextDouble();
        sc.close();
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area = %.4f.", area);

    }
}