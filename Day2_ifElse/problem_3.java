package Day2_ifElse;
// import java.util.Scanner;

// public class problem_3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         if (num1 > num2) {
//             System.out.print(num1 + " is greater");
//         } else {
//             System.out.print(num2 + " is greater");
//         }
//     }
// }

// Greatest of three numbers

import java.util.Scanner;
public class problem_3 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
int num1 = sc.nextInt();
System.out.print("Enter second number: ");
int num2 = sc.nextInt();
System.out.print("Enter third number: ");
int num3 = sc.nextInt();

if((num1>num2) && (num1>num3)){
System.out.print(num1+" is greatest number");
}
else if((num2>num1) && (num2>num3)){
System.out.print(num2+" is greatest number");
}
else if((num3>num1) && (num3>num2)){
System.out.print(num3+" is greatest number");
}    
else{
System.out.print("all numbers are equal");
}
}    
}

