import java.util.Scanner;

public class NumberFactorial {

    public static void main(String[] args) {

        int number;
        long factorial=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Calculate the factorial of ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("The factorial of %d equals %d.", number, factorial);

        sc.close();
    }
}
