package Day1_logicbuliding;
import java.util.Scanner;

public class circle_Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        float pi = 3.142f;
        float area = (float) (pi*r*r);
        System.out.println("Area of circle is: " + area);
        float circumference = (float) (2*pi*r);
        System.out.println("Circumference of circle is :" + circumference);
    }
    
}
