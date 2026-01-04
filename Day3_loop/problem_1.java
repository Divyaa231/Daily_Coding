package Day3_loop;

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        //using while loop
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}