import java.util.Scanner;
public class problem_5 {

    static void Table(int n) {

        for (int i = 1; i < 11; i++) {

            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Table(n);
    }
}
