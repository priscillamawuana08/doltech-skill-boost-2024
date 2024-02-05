package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class Gallon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of miles driven: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter the gallons of gas used: ");
        double gallonsUsed = scanner.nextDouble();

        // Calculate miles-per-gallon (MPG)
        double mpg = milesDriven / gallonsUsed;

        System.out.println("The car's miles-per-gallon (MPG) is: " + mpg);


        scanner.close();
    }
}
