package Day6_Arrays;

public class problem_13 {
    //rotate array by d
    public static void main(String[] args) {
        int[] a = {6,8,2,1,3,4,7};
        int n =a.length;
        int d = 3;
        int[] b= new int[n];
        int j=0;
        for(int i =d;i<n;i++){
            b[j] = a[i];
            j++;
        }
        for(int i =0;i<d;i++){
            b[j]= a[i];
            j++;
        }

        for(int k =0;k<n;k++){
            System.out.print(b[k] + " ");
        }

    }
    
}
