package Day2_ifElse;
import java.util.Scanner;
public class problem_11 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int num = sc.nextInt();

if(num==0){
System.out.print("digits of number is 1");
}
else{
int count = 0;
while(num > 0){
num = num/10;
count++;
}
System.out.printf("digits of number is %d",count);

}
   
}    
}
