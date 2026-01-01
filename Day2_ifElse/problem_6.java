package Day2_ifElse;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char x = sc.nextLine().charAt(0);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.print("character is vowel");
        } else {
            System.out.print("character is consonant");
        }
    }
}
