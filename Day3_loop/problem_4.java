package Day3_loop;

import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        // using a for loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter difference: ");
        int d = sc.nextInt();
        System.out.print("Enter nth term: ");
        int n = sc.nextInt();
        System.out.print("AP series is: ");
        for (int i = a; i<a+(n-1)*d;i=i+d) {
            System.out.print(i+", ");
        }

    }
}
