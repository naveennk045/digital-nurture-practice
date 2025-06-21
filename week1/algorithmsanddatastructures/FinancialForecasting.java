package week1.algorithmsanddatastructures;

public class FinancialForecasting {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double futureValue = Forecast.recursiveForecast(initialValue, growthRate, years);
        System.out.println("Future Value (Recursive): " + futureValue);
    }
}

class Forecast {
    public static double recursiveForecast(double amount, double rate, int years) {
        if (years == 0) return amount;
        return recursiveForecast(amount, rate, years - 1) * (1 + rate);
    }
}