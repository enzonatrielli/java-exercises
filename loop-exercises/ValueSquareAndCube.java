import java.util.Scanner;

public class ValueSquareAndCube {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Calculate square and cube of numbers between 1 and ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("Number [%d] | Square: %d | Cube: %d. %n", i, square, cube);
        }

        sc.close();
    }
}
