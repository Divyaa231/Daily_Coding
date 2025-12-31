package Day2_ifElse;
import java.util.Scanner;

public class problem_2 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is odd");
        }

    }

}
