package org.example.ProgrammingChallenge;

import java.util.Scanner;

public class Manipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of your favorite city: ");
        String favoriteCity = scanner.nextLine();


        int numberOfCharacters = favoriteCity.length();
        System.out.println("Number of characters in the city name: " + numberOfCharacters);

        String uppercaseCity = favoriteCity.toUpperCase();
        System.out.println("City name in all uppercase letters: " + uppercaseCity);

        String lowercaseCity = favoriteCity.toLowerCase();
        System.out.println("City name in all lowercase letters: " + lowercaseCity);

        // Display the first character in the name of the city
        char firstCharacter = favoriteCity.charAt(0);
        System.out.println("First character in the name of the city: " + firstCharacter);

        scanner.close();
    }
}
