import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_______________________Income Tax Calculator_____________________________");

        // Get user input for annual income
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        // Calculate income tax
        double tax = calculateIncomeTax(income);

        // Calculate payable income after tax
        double payableIncome = income - tax;

        // Display results
        System.out.println("\nIncome Details:");
        System.out.println("Annual Income: " + income);
        System.out.println("Income Tax: " + tax);
        System.out.println("Payable Income: " + payableIncome);

        // Suggest ways to save taxes
        suggestTaxSavingTips(income);

        scanner.close();
    }

    private static double calculateIncomeTax(double income) {
        // Simplified calculation for demonstration purposes
        double tax = 0;

        if (income <= 250000) {
            // No tax for income up to 2,50,000
            tax = 0;
        } else if (income <= 500000) {
            // 5% tax for income between 2,50,001 to 5,00,000
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            // 20% tax for income between 5,00,001 to 10,00,000
            tax = 0.2 * (income - 500000) + 0.05 * (500000 - 250000);
        } else {
            // 30% tax for income above 10,00,000
            tax = 0.3 * (income - 1000000) + 0.2 * (1000000 - 500000) + 0.05 * (500000 - 250000);
        }

        return tax;
    }

    private static void suggestTaxSavingTips(double income) {
        // Simplified suggestions for demonstration purposes
        System.out.println("\nTax Saving Tips:");

        if (income > 500000) {
            System.out.println("1. Invest in tax-saving instruments such as PPF, ELSS, or NPS.");
        }

        if (income > 1000000) {
            System.out.println("2. Consider contributing to a Voluntary Provident Fund (VPF) for additional tax benefits.");
        }

        System.out.println("3. Consult with a financial advisor for personalized tax planning.");
    }
}
