package Day6_Arrays;

//longest subarray with sum k --brute force approach o(n^3)

public class problem_24 {
     public int longestSubarray(int[] nums, int k) {
     int n = nums.length;
        int longlen = 0;
        for(int i = 0;i<n;i++){
            for(int j =i;j<n;j++){
                int sum = 0;
                for(int l = i;l<=j;l++){
                    sum += nums[l];
                    if(sum==l)
                    longlen = Math.max(longlen,j-i+1);
                }
                
            }
        }
       return longlen;
    
}
}
