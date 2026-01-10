package Day6_Arrays;
import java.util.Arrays;
public class problem_5 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] x = arr;
        x[0]=99;
        System.out.println(arr[0]);  //shallow copy

        int deep[] = Arrays.copyOf(arr,arr.length);
        deep[0]=100;
        System.out.println(arr[0]);  //deep copy
    }
}
