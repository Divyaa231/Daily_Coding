package Day1_logicbuliding;
import java.util.Scanner;

public class Arithmetic_oper {
    public static void main(String[] args){
        // int a = 2;
        // int b = 3;

        int a,b;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter first number: ");
        a= s.nextInt();

        System.out.print("5Enter second number: ");
        b= s.nextInt();

        //Addition

        int sum = a+b;
        System.out.println("sum: " + sum);

        //Subtraction
        int diff = a-b;
        System.out.println("Difference: " +diff);

        //Multiplication
        int prod = a*b;
        System.out.println("Product: " + prod);

        //Division
        int div = a/b;
        System.out.println("Division: " + div);

        //Modulus
        int mod = a%b;
        System.out.println("Modulus: " + mod);
    }
}
