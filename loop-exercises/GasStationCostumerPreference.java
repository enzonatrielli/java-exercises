import java.util.Scanner;

public class GasStationCostumerPreference {

    public static void main(String[] args) {

        String product1="Ethanol", product2="Gas", product3="Diesel", exit="Exit";
        int productOption, productCode1=0, productCode2=0, productCode3=0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("[1] - %s | [2] - %s | [3] - %s | [4] - %s", product1, product2, product3, exit);
        System.out.println();
        System.out.print("Select your option: ");
        productOption = sc.nextInt();

        while (productOption != 4) {
            switch (productOption) {
                case 1:
                    productCode1 += 1;
                    break;
                case 2:
                    productCode2 += 1;
                    break;
                case 3:
                    productCode3 += 1;
                    break;
                default:
                    System.out.println("Insert a valid code!");
            }
            System.out.printf("[1] - %s | [2] - %s | [3] - %s | [4] - %s", product1, product2, product3, exit);
            System.out.println();
            System.out.print("Select your option: ");
            productOption = sc.nextInt();
        }

        System.out.println("Thank you very much!");
        System.out.printf("%s: %d | %s: %d | %s: %d.", product1, productCode1, product2, productCode2, product3, productCode3);
        sc.close();
    }
}
