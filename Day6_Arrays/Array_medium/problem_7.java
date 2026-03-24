package Day6_Arrays.Array_medium;
import java.util.Arrays;
public class problem_7 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry;
        int [] ans = new int[n+1];
        for(int i = n-1 ; i >= 0 ; i-- ){
            if(digits[i]!=9){
                digits[i] = digits[i] + 1;
                carry = 0;
                return digits;
            }
            else{
                digits[i] = 0;
                carry = 1;
                continue;
            }
        }
        // all 9
        for(int i = 1;i<(n+1);i++){
            ans[0] = 1;
            ans[i] = 0; 
        }    
        return ans;
    }
    
public static void main(String[] agrs){
    int [] arr = {9,9,4};
    // System.out.println(Arrays.toString(plusOne(arr)));
    plusOne(arr);
    for(int i : arr){
        System.out.print(i + " ");
    }
    
}
}