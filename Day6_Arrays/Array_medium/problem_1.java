package Day6_Arrays.Array_medium;

public class problem_1 {
    //sort an array of 0s, 1s and 2s

    public static void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        for(int i = 0;i<count0;i++){
            nums[i] = 0;
        }
        for(int i = count0;i<count0+count1;i++){
            nums[i] = 1;
        }
        for(int i = count0+count1;i<n;i++){
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortZeroOneTwo(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
