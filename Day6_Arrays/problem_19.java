package Day6_Arrays;

import java.util.Scanner;

public class problem_19 {
    // Left Rotate Array by One
     public static void main(String[] args){
      
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

        int first = a[0];

        for(int j= 0;j<n-1;j++){
            a[j]= a[j+1];
        }
        a[n-1] = first;
        System.out.println("\nArray after left rotation by one: ");
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }  
}
