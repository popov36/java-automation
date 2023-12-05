package lesson3;

public class CurrencyConverter {

    private double exchangeRate;
    private double commission;
    private double amountUsd;

    public CurrencyConverter(double exchangeRate, double commission) {
        this.exchangeRate = exchangeRate;
        this.commission = commission;
    }

    public void setAmountUsd(double amountUsd) {
        this.amountUsd = amountUsd;
    }
        private double convertUsdToUah(double amountUsd) {
            return amountUsd * exchangeRate;

        }
        private double calculateCommission(double amountUsd) {
           return amountUsd * commission / 100.0;
        }


    public double calculateTotalAmount() {
        double uahAmount = convertUsdToUah(amountUsd);
        double commissionAmount = calculateCommission(uahAmount);
        return uahAmount + commissionAmount;
    }
}




