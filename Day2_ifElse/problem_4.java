package Day2_ifElse;
import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0)&&(year % 100 != 0) || (year %400 ==0)) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not a leap year");
        }
    }
}
