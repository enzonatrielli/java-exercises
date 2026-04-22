import java.util.Scanner;

public class NumbersDifference {

    public static void main(String[] args){

        int A, B, C, D, difference;
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        A = sc.nextInt();

        System.out.print("B = ");
        B = sc.nextInt();

        System.out.print("C = ");
        C = sc.nextInt();

        System.out.print("D = ");
        D = sc.nextInt();

        difference = A * B - C * D;

        System.out.printf("(%d x %d - %d x %d) = %d.", A, B, C, D, difference);

        sc.close();
    }
}