package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first test score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter the second test score: ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter the third test score: ");
        double score3 = scanner.nextDouble();

        // Calculate the average of the test scores
        double average = (score1 + score2 + score3) / 3;

        System.out.println("Test Score 1: " + score1);
        System.out.println("Test Score 2: " + score2);
        System.out.println("Test Score 3: " + score3);
        System.out.println("Average Score: " + average);

        scanner.close();
    }
}
