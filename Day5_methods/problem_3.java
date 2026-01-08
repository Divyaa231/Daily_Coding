import java.util.Scanner;
public class problem_3 {

    static void Factorial(int n){
	int fact = 1;
	for(int i=n;i>=1;i--){
	fact = fact * i;
	}
	System.out.printf("factorial of given number is %d ",fact);      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Factorial(n);
    }
}
