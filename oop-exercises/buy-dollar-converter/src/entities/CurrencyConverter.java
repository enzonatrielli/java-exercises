package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double DollarConverter(int dollars, double dollarPrice) {
        return dollars * dollarPrice;
    }

    public static double TotalToPay(double amount) {
        return amount * (1 + IOF);
    }

}
