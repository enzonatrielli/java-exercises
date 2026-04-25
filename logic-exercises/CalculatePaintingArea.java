import java.util.Locale;
import java.util.Scanner;

public class CalculatePaintingArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double width, height, area, wallPaintAmount;

        System.out.print("Width (in meters): ");
        width = sc.nextDouble();

        System.out.print("Height (in meters): ");
        height = sc.nextDouble();

        area = width * height;
        wallPaintAmount = area / 2;

        System.out.printf("To paint an area of %.1f square meters will be necessary %.1f liters of wall paint.",
                area, wallPaintAmount);

        sc.close();


    }
}
