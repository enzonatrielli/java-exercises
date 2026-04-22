import java.util.Scanner;

public class NumbersInAndOutInterval {

    public static void main(String[] args) {

        int N, X, numbersIn=0, numbersOut=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to analyze? ");
        N = sc.nextInt();

        for (int i=1; i <= N; i++) {
            System.out.printf("Number [%d]: ", i);
            X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                numbersIn += 1;
            }
            else {
                numbersOut += 1;
            }
        }

        System.out.println(numbersIn + " in.");
        System.out.println(numbersOut + " out.");

        sc.close();
    }
}
