import java.util.Scanner;

public class VectorsSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers in each vector? ");
        int quantity = sc.nextInt();
        int[] vectorA = new int[quantity];
        int[] vectorB = new int[quantity];
        int[] vectorC = new int[quantity];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Number [%d] - Vector A: ", i + 1);
            vectorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vectorB.length; i++) {
            System.out.printf("Number [%d] - Vector B: ", i+1);
            vectorB[i] = sc.nextInt();
        }

        System.out.println("VECTOR RESULT: ");
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.printf("%d ",vectorC[i]);
        }

        sc.close();

    }
}
