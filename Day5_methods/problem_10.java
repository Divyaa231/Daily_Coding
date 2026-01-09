import java.util.Scanner;
public class problem_10 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
	int n = sc.nextInt();
	int ans = sumD(n);
	System.out.print("Sum of the number digits: "+ ans);


    }
    static int sumD(int n){
	int sum = 0;
	while(n>0){
	int digit = n%10;
	sum = sum + digit;
	n = n/10;
	}
	
        return sum;
    }
    
}
