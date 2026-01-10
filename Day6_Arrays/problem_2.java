package Day6_Arrays;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter array elements: ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("\nSum of array elements: " + sum);

    }
}
