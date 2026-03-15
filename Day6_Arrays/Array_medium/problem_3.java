package Day6_Arrays.Array_medium;

public class problem_3 {
    //maximum subarray sum
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0;i < n;i++){
            int sum = nums[i];
            for(int j=i+1;j<n;j++){
                sum +=nums[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;        
    }    

public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
