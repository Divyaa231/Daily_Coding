package Day4_patterns;

import java.util.Scanner;

public class problem_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // uppercase letters
        System.out.println("\nUppercase letters pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j <= 65 + (n - 1); j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

        // Lowercase letters
        System.out.println("\nLowercase letters pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 97; j <= 97 + (n - 1); j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

    }
}
