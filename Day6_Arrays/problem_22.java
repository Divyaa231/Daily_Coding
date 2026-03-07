package Day6_Arrays;

import java.util.Scanner;

public class problem_22 {
    //Find missing number

        public static int missingNumber(int[] nums) {
        int n = nums.length;
        int Expected_sum = 0;
        int calculated_sum = 0;
        for(int i=0;i<=n;i++){
            Expected_sum =  Expected_sum + i;
        }

        for(int i = 0; i<n ;i++){
            calculated_sum = calculated_sum + nums[i];

        }

        int result = (Expected_sum - calculated_sum);

        return result;
        
    }

    public static void main(String[] args){
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

        int r =  missingNumber(a);
        System.out.println("\nMissing number is: " + r);
    

    }
    
}
