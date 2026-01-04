package Day3_loop;

public class problem_15 {
//Find GCD of two numbers
    public static void main(String[] args){
        int a=56;
        int b=98;
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
    }    
}
