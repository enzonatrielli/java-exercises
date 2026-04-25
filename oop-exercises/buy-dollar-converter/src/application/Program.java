package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dollar price? $ ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? $ ");
        int totalDollars = sc.nextInt();
        double convertedValue = CurrencyConverter.DollarConverter(totalDollars, dollarPrice);
        double totalPrice = CurrencyConverter.TotalToPay(convertedValue);
        System.out.printf("Amount to be paid in reais: R$ %.2f.", totalPrice);

        sc.close();
    }
}
