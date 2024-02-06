package org.example.ProgrammingChallenge;

public class StarPattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper part of the pattern
        //
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        // hm
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
