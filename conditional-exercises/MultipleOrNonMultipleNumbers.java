import java.util.Scanner;

public class MultipleOrNonMultipleNumbers {

    public static void main(String[] args) {

        int A, B;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number A: ");
        A = sc.nextInt();
        System.out.print("Number B: ");
        B = sc.nextInt();

        if (A >= B) {
            if (A % B == 0) {
                System.out.println("Multiple numbers!");
            }
            else {
                System.out.println("Non multiple numbers!");
            }
        }
        else {
            if (B % A == 0) {
                System.out.println("Multiple numbers!");
            }
            else {
                System.out.println("Non multiple numbers!");
            }
        }
        sc.close();
    }
}