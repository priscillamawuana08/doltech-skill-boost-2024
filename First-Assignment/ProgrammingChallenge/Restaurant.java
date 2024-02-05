package org.example.ProgrammingChallenge;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the charge for the meal: $");
        double mealCharge = scanner.nextDouble();

        // Calculate the tax (6.75% of the meal charge)
        double taxRate = 0.0675;  // 6.75%
        double taxAmount = mealCharge * taxRate;

        // Calculate the total after adding the tax
        double totalWithTax = mealCharge + taxAmount;

        // Calculate the tip (20% of the total with tax)
        double tipRate = 0.20;  // 20%
        double tipAmount = totalWithTax * tipRate;

        // Calculate the total bill
        double totalBill = totalWithTax + tipAmount;

        // Display the results
        System.out.println("Meal Charge: $" + mealCharge);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Tip Amount: $" + tipAmount);
        System.out.println("Total Bill: $" + totalBill);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
