import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {

        int a, b, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        a = sc.nextInt();
        System.out.printf("%d + ", a);
        b = sc.nextInt();
        result = a + b;

        System.out.printf("The sum between %d and %d results %d.", a, b, result);

        sc.close();
    }
}
