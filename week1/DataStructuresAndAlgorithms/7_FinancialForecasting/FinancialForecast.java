public class FinancialForecast {

    static double futureValue(double amount, double rate, int years) {
        if (years == 0) return amount;
        return futureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.08;
        int years = 5;

        double result = futureValue(initialInvestment, annualGrowthRate, years);

        System.out.printf("After %d years at %.2f%% growth, $%.2f becomes $%.2f%n",
                years, annualGrowthRate * 100, initialInvestment, result);
    }
}
