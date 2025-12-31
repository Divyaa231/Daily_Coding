package Day2_ifElse;

import java.util.Scanner;

public class problem_1 {
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if(num ==0){
            System.out.print("Number is zero");
        }
        else if(num>0){
            System.out.print("Number is positive");
        }
        else{
            System.out.print("Number is negative");
        }
        }
}
