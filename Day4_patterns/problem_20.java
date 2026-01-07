package Day4_patterns;

import java.util.Scanner;

public class problem_20 {
      // verticallly mirrored right angled triangle method 2
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}
