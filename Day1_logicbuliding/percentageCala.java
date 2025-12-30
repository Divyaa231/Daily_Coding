package Day1_logicbuliding;
import java.util.Scanner;
public class percentageCala {
    public static void main(String[] args){
        float  sub1, sub2, sub3, sub4,sub5;
        double total, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of student in subject 1: ");
        sub1 = sc.nextFloat();
        System.out.print("Enter marks of student in subject 2: ");
        sub2 = sc.nextFloat();
        System.out.print("Enter marks of student in subject 3: ");
        sub3 = sc.nextFloat();
        System.out.print("Enter marks of student in subject 4: ");
        sub4 = sc.nextFloat();
        System.out.print("Enter marks of student in subject 5: ");
        sub5 = sc.nextFloat();
        total =sub1 + sub2 +sub3 +sub4 +sub5;
        percentage =(total/500)*100;
        System.out.print("Percentage of student is "+percentage+"%");


    }
    
}
