import java.util.Scanner;

public class CartesianPlaneOnlyQuadrants {

    public static void main(String[] args) {

        int x=1, y=1;
        Scanner sc = new Scanner(System.in);


        while (x != 0 && y !=0) {
            System.out.print("Coordinate X: ");
            x = sc.nextInt();
            System.out.print("Coordinate Y: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("First Quadrant");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second Quadrant");
            }
            else if (x < 0 && y < 0) {
                System.out.print("Third Quadrant");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Fourth Quadrant");
            }
        }

        sc.close();
    }
}
