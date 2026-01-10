package Day6_Arrays;
import java.util.Scanner;
public class problem_7 {
        public static void main(String[] args) {
        //multiply odd indexed elements by 2 and add 10 to even indexed elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        readArray(n,arr);
        System.out.println("Array:" );
        displayArray(n,arr);
        func(n,arr);
    }
    static void readArray(int n,int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    static void displayArray(int n,int[] arr){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");

    }
    static void func(int n, int[] arr){
        System.out.println("Modified Array: ");
        for(int i =0;i<n;i++){
            if(i%2==0){
                arr[i] = (arr[i]+10);
            }
            else{
                arr[i] = (arr[i]*2);
            }
        }
        displayArray(n,arr);
    }
}
