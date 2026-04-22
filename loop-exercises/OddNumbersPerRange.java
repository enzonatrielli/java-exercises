import java.util.Scanner;

public class OddNumbersPerRange {

    public static void main(String[] args) {

        int userNumber;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Number: ");
            userNumber = sc.nextInt();
            if (userNumber < 0 || userNumber > 1000) {
                System.out.println("The value must be between 0 - 1000.");
            }
            else {
                for (int i=0; i <= userNumber; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            }
        }

        sc.close();
    }
}