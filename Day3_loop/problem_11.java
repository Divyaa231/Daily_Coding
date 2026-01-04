package Day3_loop;
import java.util.Scanner;
public class problem_11 {
// check whether a number is prime or composite
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
Boolean flag = true;
for(int i=2;i<=n-1;i++){
 if(n%i==0){
	flag = false;
    break;
	}
}
if(n==1){
System.out.print("Neither prime nor composite");
}
else if(flag==false){
System.out.print("Composite number");
}
else{
System.out.print("prime number");
}
}    
}
