import java.util.Scanner;

public class WelcomeMessage {

    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        name = sc.next();

        System.out.printf("Hello %s, it's nice to meet you!", name);

        sc.close();
    }
}
