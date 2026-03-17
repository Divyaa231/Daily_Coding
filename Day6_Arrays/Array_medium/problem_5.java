package Day6_Arrays.Array_medium;

public class problem_5 {
     public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0; // even index
        int neg = 1; // odd index

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }    
}
