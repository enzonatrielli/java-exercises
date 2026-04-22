import java.util.Scanner;

public class GameDuration {

    public static void main(String[] args) {

        int init_hour, final_hour, duration;
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial hour of the game: ");
        init_hour = sc.nextInt();
        System.out.print("Ending hour of the game: ");
        final_hour = sc.nextInt();

        if (init_hour < final_hour)  {
            duration = (final_hour - init_hour);
        }
        else if (init_hour == final_hour) {
            duration = 24;
        }
        else {
            duration = 24 - (init_hour - final_hour);
        }

        System.out.printf("Duration of the game: %d hour(s).", duration);
        sc.close();
    }
}