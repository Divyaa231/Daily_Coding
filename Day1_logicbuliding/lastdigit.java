package Day1_logicbuliding;
import java.util.Scanner;
public class lastdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num  = sc.nextInt();
        int lastdigit = num % 10;
        System.out.print("Last digit of the number is :"+lastdigit);
        }
    
}
