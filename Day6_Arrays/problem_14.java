package Day6_Arrays;

public class problem_14 {
    //rotate array 
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 2, 9, 3, 8};
        int n = a.length;
        int d =9;
        d =  d%n;
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);

        for(int i =0;i<n;i++){
            System.out.print(a[i] + " ");
        }

    }
    static void reverse(int[] a,int i,int j){
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    
}
