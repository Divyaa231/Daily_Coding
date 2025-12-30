package Day1_logicbuliding;
import java.util.Scanner;

public class temp_con {
    public static void main(String[] args){
        double c,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        c= sc.nextDouble();
        f =(c*9/5)+32;
        System.out.print("Temperature in Fahrenheit is: " + f);

    }

    
}
