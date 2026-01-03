package Day3_loop;
import java.util.Scanner;
public class problem_8 {
    // Write a program to print the series: 1,n,2,n-1,3,n-2,...
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n: ");
int n = sc.nextInt();
for(int i=1;i<=n;i++,n--){
System.out.print(i +", " + n + ","+" ");
}
}

}