package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class PercentageForMalesAndFemales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of males in the class: ");
        int males = scanner.nextInt();

        System.out.print("Enter the number of females in the class: ");
        int females = scanner.nextInt();

        // Calculate the total number of students in the class
        int totalStudents = males + females;

        // Calculate the percentage of males and females
        double percentageMales = (double) males / totalStudents * 100;
        double percentageFemales = (double) females / totalStudents * 100;

        System.out.println("Percentage of males: " + percentageMales + "%");
        System.out.println("Percentage of females: " + percentageFemales + "%");


        scanner.close();
    }
}
