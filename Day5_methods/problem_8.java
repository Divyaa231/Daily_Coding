import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
	int n = sc.nextInt();
	int ans = reverse(n);
	System.out.print("Reverse of the number: "+ ans);


    }
    static int reverse(int n){
	int rev = 0;
	while(n>0){
	int digit = n%10;
	rev = (rev * 10) + digit;
	n = n/10;
	}
	
        return rev;
    }
    
}
