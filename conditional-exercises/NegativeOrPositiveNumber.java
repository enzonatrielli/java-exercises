import java.util.Scanner;

public class NegativeOrPositiveNumber {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("Non negative number.");
        }
        else {
            System.out.println("Negative number.");
        }

        sc.close();
    }
}