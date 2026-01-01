package Day2_ifElse;
import java.util.Scanner;
public class problem_10{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
System.out.println("Table of the number->");
int p = 1;
for(int i=1;i<11;i++){
p = n*i;
System.out.printf("%d x %d = %d\n",n,i,p);
}

}  
}
