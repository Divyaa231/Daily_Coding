package Day6_Arrays;
import java.util.Arrays;
public class problem_6 {
    //sort array builtin function
    public static void main(String[] args){
        int[] arr = {5,3,8,1,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
