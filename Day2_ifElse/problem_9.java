package Day2_ifElse;
import java.util.Scanner;
public class problem_9 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first side: ");
int a = sc.nextInt();
System.out.print("Enter second side: ");
int b = sc.nextInt();
System.out.print("Enter third side: ");
int c = sc.nextInt();

if(a+b>c && b+c>a && a+c>b){
System.out.print("Valid Triangle");
}
else{
System.out.print("Not a valid Triangle");
}

}    
}
