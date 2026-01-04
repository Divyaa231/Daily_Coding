package Day3_loop;
import java.util.Scanner;
public class problem_14 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
int a = 1,b=1;
int c;
System.out.print(a+" "+b+" ");
int sum = 0;
for(int i=3;i<=n;i++){
sum = a + b;
System.out.print(sum+" ");
a = b;
b = sum;
}
}
}
