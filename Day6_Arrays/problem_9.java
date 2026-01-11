package Day6_Arrays;

public class problem_9 {
    public static void main(String[] args) {
    //wave array
     int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for(int i =0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    
    }
}