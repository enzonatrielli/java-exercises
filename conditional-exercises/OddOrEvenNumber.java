import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN NUMBER");
        }
        else {
            System.out.println("ODD NUMBER");
        }

        sc.close();
    }
}