package Day6_Arrays;

public class problem_23 {
    //maximum consecutive ones
    class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i =0;
        int count = 0;
        int max = 0;
        while(i<n){
            if(nums[i] == 1){
                count ++;
                if(max < count){
                    max = count;
                }

            }
            else{
                count = 0;
            }
            i++;
        }
        
        return max;
        
    }
}
}
