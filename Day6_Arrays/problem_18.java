package Day6_Arrays;

import java.util.Scanner;

public class problem_18 {
    //remove duplicates from sorted array
    public static void main(String[] args){
        // int a[] = {1,1,2,2,3,4,4,5};
        // int n = a.length;

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


        int i=0;
        int count = 1;
        for(int j = 0;j<n;j++){
            if(a[i] == a[j]){
                continue;
            }
            else{
                count++;
                i = j;
            }

        }
        System.out.print(a[i]+ " ");
        System.out.print("\ncount = "+ count);

    }
    
}
