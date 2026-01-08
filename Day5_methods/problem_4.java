import java.util.Scanner;
public class problem_4 {

    static void MaxNum(int a, int b) {
        int m = Math.max(a, b);
        System.out.printf("Maximum is %d ", m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        MaxNum(a, b);
    }
}
