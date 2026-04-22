import java.util.Scanner;
import java.util.Locale;

public class IntervalOrOutOfInterval {

    public static void main(String[] args) {

        double value;
        String interval_str;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Value: ");
        value = sc.nextDouble();

        if (value >= 0) {
            if (value <= 25) {
                interval_str = "0, 25";
            } else if (value <= 50) {
                interval_str = "25, 50";
            } else if (value <= 75) {
                interval_str = "50, 75";
            } else if (value <= 100) {
                interval_str = "75, 100";
            } else {
                interval_str = "Out of interval";
            }
        }
        else {
            interval_str = "Out of interval";
        }

        System.out.printf("Interval [%s].", interval_str);
        sc.close();

    }
}