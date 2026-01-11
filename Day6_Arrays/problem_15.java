package Day6_Arrays;

public class problem_15 {
    //find missing element in array of size n containing elements from 1 to n with one element missing
    public static void main(String[] args) {
        int[] a = {1,3,4,5};
        int n = a.length + 1;
        int s = n*(n+1)/2;
        int asum = 0;
        for(int ele:a){
            asum+=ele;
        }
        System.out.println("Missing element is: "+ (s - asum));
    }
    
}
