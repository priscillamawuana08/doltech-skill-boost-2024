package org.example.ProgrammingChallenge;

public class SalesPrediction {
    public static void main(String[] args) {

        double totalSales = 4.6;
        double eastCoastPercentage = 0.62;

        double eastCoastSales = totalSales * eastCoastPercentage;

        System.out.println("The East Coast division is predicted to generate $" + eastCoastSales + " million in sales.");
    }
}
