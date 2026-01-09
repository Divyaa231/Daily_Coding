import java.util.Scanner;
public class problem_7 {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
	int n = sc.nextInt();

    isPrime(n);
    }

    static void isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime && n>1){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
