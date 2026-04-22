import java.util.Scanner;
import java.util.Locale;

public class GeometricalAreas {

    public static void main(String[] args){

        double A, B, C, triangle, circle, trapezoid, square, rectangle;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        A = sc.nextDouble();
        System.out.print("B = ");
        B = sc.nextDouble();
        System.out.print("C = ");
        C = sc.nextDouble();

        triangle = A * C / 2;
        circle = Math.PI * Math.pow(C, 2);
        trapezoid = (A + B) * C / 2;
        square = Math.pow(B, 2);
        rectangle = A * B;

        System.out.println();
        System.out.printf("TRIANGLE: %.3f", triangle);
        System.out.println();
        System.out.printf("CIRCLE: %.3f", circle);
        System.out.println();
        System.out.printf("TRAPEZOID: %.3f", trapezoid);
        System.out.println();
        System.out.printf("SQUARE: %.3f", square);
        System.out.println();
        System.out.printf("RECTANGLE: %.3f", rectangle);

        sc.close();
    }
}