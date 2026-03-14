package Day6_Arrays.Array_medium;

public class problem_1O {
    //sort an array of 0s, 1s and 2s

    public static void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high  = n-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                mid++; low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        
    }

       
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
            sortColors(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
