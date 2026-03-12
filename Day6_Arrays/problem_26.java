package Day6_Arrays;

import java.util.Scanner;
import java.util.HashMap;

public class problem_26 {

    // two sum approach O(n)
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length; 
        HashMap<Integer,Integer>map = new HashMap<>();  
        for(int i = 0;i<n;i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                 return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }   

        return new int[]{};
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