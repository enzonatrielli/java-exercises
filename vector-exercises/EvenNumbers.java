import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int evenQuantity = 0;

        System.out.print("How many numbers to insert: ");
        int numbersQuantity = sc.nextInt();
        int[] numbers = new int[numbersQuantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insert a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("EVEN NUMBERS: ");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d ", numbers[i]);
                evenQuantity += 1;
            }
        }

        System.out.println();
        System.out.printf("%nEVEN NUMBERS QUANTITY = %d", evenQuantity);

        sc.close();
    }
}
