package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student;
        student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Grade [%d]: ", i);
            student.grade += sc.nextDouble();
        }

        student.showSituation();

        sc.close();
    }
}
