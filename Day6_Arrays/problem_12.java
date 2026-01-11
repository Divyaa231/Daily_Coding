package Day6_Arrays;

public class problem_12 {
    //reverse array
     public static void main(String[] args) {
        int[] a = {2,4,5,1,3};
        int n = a.length;

        // method 1
//        for(int i=(n-1);i>=0;i--){
//            System.out.print(a[i]+" ");
//        }
        //method 2
            int i =0;
            int j = n-1;
            while(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            for(int k =0;k<n;k++){
                System.out.print(a[k]+" ");
            }

        }
    
}
