import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        final int CORRECT_PASSWORD = 2002;
        int insertPassword = 0;
        Scanner sc = new Scanner(System.in);

        while (insertPassword != CORRECT_PASSWORD) {
            System.out.print("Password (four digits): ");
            insertPassword = sc.nextInt();
            if (insertPassword != CORRECT_PASSWORD) {
                System.out.println("Incorrect password!");
            }
        }

        System.out.println("Access granted!");
        sc.close();

    }
}
