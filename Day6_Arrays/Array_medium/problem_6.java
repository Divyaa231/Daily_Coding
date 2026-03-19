package Day6_Arrays.Array_medium;

import java.util.Arrays;

public class problem_6 {
    class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = 0;

        for(int i = n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index = i;
                // swap
                int temp = nums[i-1];
                nums[i-1] = nums[n-1];
                nums[n-1] = temp;
                break;
            }
            
        }
        Arrays.sort(nums,(index),n);        
    }
}
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        new problem_6().new Solution().nextPermutation(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
