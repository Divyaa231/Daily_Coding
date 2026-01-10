package Day6_Arrays;

import java.util.Scanner;

public class problem_3 {
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
            System.out.print(a[i] + " ");
        }
        int m = a[0];
        for (int i = 0; i < n; i++) {
           // m = Math.max(m, a[i]);
              if(a[i]>m){
                m=a[i];
              }
        }
        System.out.print("\nMaximum element: " + m);

    }
}
