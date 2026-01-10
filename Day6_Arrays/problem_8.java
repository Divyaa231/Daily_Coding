package Day6_Arrays;
import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0;i <n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        System.out.print("\nEnter search element: ");
        int x = sc.nextInt();
        boolean flag = false;
        for(int i =0;i<n;i++){
            if(a[i]==x);
            flag = true;
            break;
        }
        if(flag==true){
            System.out.printf("%d is found in the array\n",x);
            flag = true;
        }
        else{
            System.out.printf("%d is not found in the array\n",x);
        }


    }
}
