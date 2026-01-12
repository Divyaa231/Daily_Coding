package Day6_Arrays;

import java.util.Scanner;

public class problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // check if array is sorted
        boolean isSorted = false;
        for (int i = 0, j = 1; j < n; i++, j++) {
            if (a[i] <= a[j]) {
                isSorted = true;
                
            } else {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.print("\nsorted");
        }
        else {
            System.out.print("\nnot sorted");
        }

    }
}
