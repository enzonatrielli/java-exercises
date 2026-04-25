import java.util.Scanner;
import java.util.Locale;

public class DistanceConverter {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double metersDistance, km, hm, dam, dm, cm, mm;

        System.out.print("Insert a distance (in meters): ");
        metersDistance = sc.nextDouble();

        km = metersDistance / 1000;
        hm = metersDistance / 100;
        dam = metersDistance / 10;
        dm = metersDistance * 10;
        cm = metersDistance * 100;
        mm = metersDistance * 1000;

        System.out.printf("The distance of %.2f meters converted to: %f Km | %f Hm | %f Dam | %f dm | %f cm | %f mm."
        , metersDistance, km, hm, dam, dm, cm, mm);

        sc.close();
    }
}
