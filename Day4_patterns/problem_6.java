package Day4_patterns;

import java.util.Scanner;
public class problem_6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // uppercase letters
        System.out.println("Uppercase letters pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
        // Lowercase letters
        System.out.println("\nLowercase letters pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    
}
}
