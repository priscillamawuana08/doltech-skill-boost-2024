package org.example.ProgrammingChallenge;

public class LandCalculation {
    public static void main(String[] args) {
        int squareFeetInOneAcre = 43560;
        int totalSquareFeet = 389767;

        double numberOfAcres = (double) totalSquareFeet / squareFeetInOneAcre;

        System.out.println("The tract of land is equivalent to " + numberOfAcres + " acres.");
    }
}
