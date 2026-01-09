public class problem_6 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a,b);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print("Elements after swapping: a = "+a+", b = "+b);
    }
    
}
