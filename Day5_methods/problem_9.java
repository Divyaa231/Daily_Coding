import java.util.Scanner;

public class problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();

        // System.out.printf("%d^%d = %d", a, b, Math.pow(a, b));        

        int ans = power(a, b);
        System.out.printf("%d^%d = %d", a, b, ans);

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

}
