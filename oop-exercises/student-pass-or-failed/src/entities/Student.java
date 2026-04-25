package entities;

public class Student {

    public String name;
    public double grade, grade1, grade2, grade3;

    public double calculateMissingPoints() {
        if (grade < 60) {
            return 60 - grade;
        }
        else {
            return grade;
        }
    }

    public boolean passOrFailed() {
        return !(grade < 60);

    }
    public void showSituation() {
        System.out.printf("FINAL GRADE = %.2f %n", grade);
        if (passOrFailed()) {
            System.out.print("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS.", calculateMissingPoints());
        }
    }
}
