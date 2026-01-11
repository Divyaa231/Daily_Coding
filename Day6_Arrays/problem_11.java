package Day6_Arrays;

public class problem_11 {
    //second largest element in an array
    public static void main(String[] args) {
        int[] a = {2, 3, 8, 9, 7, 1};
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>smax && a[i]!=max){
                smax = a[i];
            }
        }
//        System.out.println(max);
//        System.out.println(smax);
        System.out.println("second maximum element is: " + smax);
    }
    
}
