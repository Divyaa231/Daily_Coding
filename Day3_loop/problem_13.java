package Day3_loop;

import java.util.Scanner;

public class problem_13 {
    // Check whether a number is Armstrong.
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
int count = 0;
int sum = 0;
int num = n;
int og =n;
while(n>0){
count++;
n= n/10;
}
while(num>0){
int digit = num%10;
sum = sum + (int)Math.pow(digit,count);
num = num/10;
}
if(og==sum){
System.out.print("Armstrong number");
}
else{
System.out.print("Not an Armstrong number");
}

}
}
