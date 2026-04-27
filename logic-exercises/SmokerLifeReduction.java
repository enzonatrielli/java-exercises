import java.util.Scanner;

public class SmokerLifeReduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Smoked cigars per day: ");
        int cigarsPerDay = sc.nextInt();
        System.out.print("Years smoking: ");
        int yearsSmoking = sc.nextInt();

        int lifeDaysLost = (cigarsPerDay * 365 * yearsSmoking) * 10 / 1440;

        System.out.printf("You have lost %d days of your life.", lifeDaysLost);

        sc.close();
    }
}
