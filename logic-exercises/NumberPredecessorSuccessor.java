import java.util.Scanner;

public class NumberPredecessorSuccessor {

    public static void main(String[] args){

        int number, predecessor, successor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        number = sc.nextInt();
        predecessor = number - 1;
        successor = number + 1;

        System.out.printf("Predecessor: %d - Number: %d - Successor: %d", predecessor, number, successor);

        sc.close();
    }
}
