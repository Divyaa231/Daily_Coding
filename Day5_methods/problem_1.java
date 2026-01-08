import java.util.Scanner;
public class problem_1 {

    static void sum(int a , int b){
        int sum = a + b;
        System.out.println("The sum of two numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}

