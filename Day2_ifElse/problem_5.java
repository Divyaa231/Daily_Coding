package Day2_ifElse;
import java.util.Scanner;
public class problem_5 {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value of n: ");
	int n = sc.nextInt();
	int sum =0;
	for(int i=1;i<=n;i++){
		sum+=i;
	}
	System.out.printf("Sum of first %d number is : %d",n,sum);
} 
}