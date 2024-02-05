package org.example.ProgrammingChallenge;
import java.util.Scanner;

public class TaxRate {
    public static void main(String[] args) {
        double stateTaxRate = 0.04; // 4%
        double countyTaxRate = 0.02; // 2%

        // Prompt the user to enter the amount of purchase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of purchase: $");
        double amountOfPurchase = scanner.nextDouble();
        scanner.close();

        // Calculate taxes
        double stateSalesTax = amountOfPurchase * stateTaxRate;
        double countySalesTax = amountOfPurchase * countyTaxRate;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalSale = amountOfPurchase + totalSalesTax;

        // Display the results
        System.out.println("Amount of Purchase: $" + amountOfPurchase);
        System.out.println("State Sales Tax (4%): $" + stateSalesTax);
        System.out.println("County Sales Tax (2%): $" + countySalesTax);
        System.out.println("Total Sales Tax: $" + totalSalesTax);
        System.out.println("Total Sale: $" + totalSale);

    }
}
