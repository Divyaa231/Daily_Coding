package Day2_ifElse;
import java.util.Scanner;
public class problem_12 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
int temp = n;
int rev = 0;
int digit;
while(n>0){
digit = n%10;
rev = (rev*10)+digit;
n = n/10;
}

if(rev == temp){
System.out.print("Palindrome number");
}
else{
System.out.print("Not palindrome number");
}

}
    
}
