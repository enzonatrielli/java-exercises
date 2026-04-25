import java.util.Scanner;

public class BoardingHouseWithoutClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] roomsName = new String[10];
        String[] emails = new String[10];

        System.out.print("Students to rent rooms: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Rent #%d%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            roomsName[room] = name;
            emails[room] = email;
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < roomsName.length; i++) {
            if (roomsName[i] != null) {
                System.out.printf("%d: %s, %s%n", i, roomsName[i], emails[i]);
            }
        }

        sc.close();
    }
}
