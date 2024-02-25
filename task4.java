import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base currency code: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency code: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Unable to fetch exchange rates. Exiting.");
            System.exit(1);
        }

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        double convertedAmount = amountToConvert * exchangeRate;

        System.out.printf("%s %.2f is equivalent to %s %.2f%n",
                baseCurrency, amountToConvert, targetCurrency, convertedAmount);

        scanner.close();
    }

    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        return 1.5;
    }
}
