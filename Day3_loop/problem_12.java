package Day3_loop;

import java.util.Scanner;

public class problem_12 {
    // prime number factors
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.print("Neither prime nor composite");
            return;
        }

        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                System.out.print(n/i + " ");
        
            }
        }
    }
}
