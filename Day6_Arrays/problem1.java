package Day6_Arrays;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Your array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nNegative elements in the array are:");
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.println(a[i] + " ");
            } else {
                continue;
            }
        }

    }

}
