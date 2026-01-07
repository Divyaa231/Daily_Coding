package Day4_patterns;

import java.util.Scanner;

public class problem_27 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp=n-1, nst=1;

        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= nsp; j++) {
            System.out.print("  ");
        }
        for(int j=1;j<=nst;j++){
            System.out.print("* ");
        }
        System.out.println();
        nsp--;
        nst+=2;
        }

        int nsp1 = 1, nst1 = (2*n)-3;
        for (int i = 1; i < n; i++) {
        for (int j = 1; j <= nsp1; j++) {
            System.out.print("  ");
        }
        for(int j=1;j<=nst1;j++){
            System.out.print("* ");
        }
        System.out.println();
        nsp1++;
        nst1-=2;
        }






}   
}
