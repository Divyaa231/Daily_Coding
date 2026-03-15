package Day6_Arrays.Array_medium;

public class problem_2O {
    //majority element

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count =0;
        int ele = 0;
        for(int i =0;i<n;i++){
            if(count==0){
                count++;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < n;i++){
            if(nums[i]==ele){
                count1 ++;
            }
        }
        if(count1 > n/2){
            return ele;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    
}
