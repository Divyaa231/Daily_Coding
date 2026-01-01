package Day2_ifElse;
import java.util.Scanner;

public class problem_8 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter marks of student: ");
int m = sc.nextInt();
if(m>=90 && m<=100){
System.out.print("A grade");
}
else if(m>=80 && m<=89){
System.out.print("B grade");
}
else if(m>=70 && m<=79){
System.out.print("C grade");
}
else if(m>=60 && m<=69){
System.out.print("D grade");
}
else{
System.out.print("Fail");
}

}   
}
