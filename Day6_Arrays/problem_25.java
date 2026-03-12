package Day6_Arrays;

import java.util.Scanner;

public class problem_25 {

    // two sum approach O(n^2)
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] solarr = new int[2];

        for(int i = 0; i < n; i++){

            int sum = nums[i];

            for(int j = i + 1; j < n; j++){

                sum = nums[i] + nums[j];

                if(sum == target){
                    solarr[0] = i;
                    solarr[1] = j;
                    return solarr;
                }

            }
        }

        return solarr;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        problem_25 obj = new problem_25();

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices are: " + result[0] + " " + result[1]);
    }
}


/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] solArr = new int[2];
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    solArr[0] = i;
                    solArr[1] = j;
                }
            }
            else{
                return;
            }
        }
        return solArr;
    }
}
*/

