package lesson3;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter(36.55, 1);

        double usdAmount = 150.0;

        converter.setAmountUsd(usdAmount);

        double totalAmount;
        totalAmount = converter.calculateTotalAmount();

        System.out.println("Total: " + totalAmount + " грн");



    }


}
