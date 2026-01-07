package Day4_patterns;
import java.util.Scanner;
public class problem_29 {
    // number zoom pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(Math.min(i,j)+" ");
                //or
                //System.out.print((i<j?i:j)+" ");
            }
            System.out.println();
        }
    }

}
