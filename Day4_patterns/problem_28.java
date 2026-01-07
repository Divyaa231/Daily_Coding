package Day4_patterns;
import java.util.Scanner;
public class problem_28 {
//bridge pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp=1;
        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
        for(int j=1;j<=n-i;j++){
            System.out.print("* ");
        }
        for (int j = 1; j <= nsp; j++) {
            System.out.print("  ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print("* ");
        }
        System.out.println();
        nsp+=2;
   
        }



}   
}
