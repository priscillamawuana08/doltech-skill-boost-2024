package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {

        final int COOKIES_PER_SERVING = 4;  // Each serving is 4 cookies
        final int CALORIES_PER_SERVING = 300;  // Calories per serving

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cookies you ate: ");


        int cookiesEaten = scanner.nextInt();

        // Calculate the number of servings and total calories consumed
        int servings = cookiesEaten / COOKIES_PER_SERVING;
        int totalCalories = servings * CALORIES_PER_SERVING;

        System.out.println("Number of servings: " + servings);
        System.out.println("Total calories consumed: " + totalCalories);

//hmm
        scanner.close();
    }

}
