package Day6_Arrays;

import java.util.Scanner;

public class problem_10 {
    //Twosum problem
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nEnter target: ");
        int x = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            int s = a[i];
            for(int j=i+1;j<n;j++){
                if(s+a[j]==x){
                    found = true;
                    break;
                }
            }
        }
        if(found){
            System.out.print("target is found");
        }
        else{
            System.out.print("target is not found");
        }


    }
    
}
