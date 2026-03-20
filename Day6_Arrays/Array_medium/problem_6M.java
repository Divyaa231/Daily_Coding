package Day6_Arrays.Array_medium;

import java.util.Arrays;

public class problem_6M {
    class Solution {
        public void nextPermutation(int[] nums) {
        int n= nums.length;
        int index = -1;

        for(int i = n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index = i-1;
                break;
            }
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int j=n-1;j>index;j--){
            if(nums[index] < nums[j]){
                swap(nums,index,j);  
                break;              
            }
        }

        reverse(nums,index +1,n-1);

    }

        private void swap(int []nums, int i ,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int []nums,int start,int end){
            while(start<end){
                swap(nums,start,end);
                start++;
                end--;
            }
        }

}
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        new problem_6().new Solution().nextPermutation(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
