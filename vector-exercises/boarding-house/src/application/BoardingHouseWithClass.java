package application;

import entities.Person;

import java.util.Scanner;

public class BoardingHouseWithClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person[] rooms = new Person[10];
        Person person;

        System.out.print("How many rooms will be rented? ");
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
            rooms[room] = new Person(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.printf("%d: %s, %s%n", i, rooms[i].getName(), rooms[i].getEmail());
            }
        }

        sc.close();
    }
}
