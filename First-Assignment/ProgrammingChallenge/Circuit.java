package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class Circuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the retail price of the circuit board: ");
        double retailPrice = scanner.nextDouble();

        // Calculate the profit using the formula: Profit = Retail price × 0.4
        double profit = retailPrice * 0.4;


        System.out.println("Retail Price: $" + retailPrice);
        System.out.println("Profit Earned: $" + profit);

        scanner.close();
    }
}
