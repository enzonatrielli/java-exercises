import java.util.Scanner;

public class ShowOnlyNegativeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to type: ");
        int numbers = sc.nextInt();
        int[] vect = new int[numbers];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
