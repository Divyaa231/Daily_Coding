package Day3_loop;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        //GP series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter nth term: ");
        int n = sc.nextInt();
        System.out.print("GP series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            a = a * r;
        }

    }
}
