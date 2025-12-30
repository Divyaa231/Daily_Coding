package Day1_logicbuliding;
import java.util.Scanner;

public class sq_cube {
    public static void main(String[] args){
        int num,sq,cube;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s.nextInt();

        sq = num*num;
        System.out.println("square of num is :" +sq);

        cube = num*num*num;
        System.out.println("Cube of num is : "+ cube );

    }    
}
