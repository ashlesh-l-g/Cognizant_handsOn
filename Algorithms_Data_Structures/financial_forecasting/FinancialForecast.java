package Algorithms_Data_Structures.financial_forecasting;

public class FinancialForecast {

    public static double power(double base, int exp) {

        if (exp == 0)
            return 1;

        double half = power(base, exp / 2);

        if (exp % 2 == 0)
            return half * half;

        return half * half * base;
    }

    public static double forecast(double currentValue,
                                  double growthRate,
                                  int years) {

        return currentValue *
                power(1 + growthRate, years);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        System.out.printf(
                "Predicted value after %d years: %.2f%n",
                years,
                forecast(currentValue, growthRate, years)
        );
    }
}