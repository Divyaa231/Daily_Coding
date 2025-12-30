package Day1_logicbuliding;
import java.util.Scanner;

public class threeD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        System.out.println("Hundreds place: " + hundreds);
        System.out.println("Tens place: " + tens);
        System.out.println("Units place: " + units);
        System.out.println("Sum of digits: " + (hundreds + tens + units));
        System.out.println("reverse number:" + units + tens + hundreds);
    }
    
}
