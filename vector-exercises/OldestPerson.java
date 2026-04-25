import java.util.Scanner;

public class OldestPerson {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oldestPerson = 0;
        String oldestPersonName = "";

        System.out.print("How many people do you want to insert: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        String[] names = new String[quantity];
        int[] age = new int[quantity];

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Person [%d]:", i + 1);
            System.out.println();
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();
            if (age[i] > oldestPerson) {
                oldestPerson = age[i];
                oldestPersonName = names[i];
            }
        }

            System.out.printf("Oldest person: %s [%d years old].", oldestPersonName, oldestPerson);

            sc.close();
        }
    }
