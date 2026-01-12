package Day6_Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class problem_21 {
        public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        
        System.out.print(arr.get(2));
        arr.set(3,90);
        System.out.println(arr);

        int n = arr.size();
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }

        arr.add(78);
        System.out.println(arr);
        arr.add(2,10);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
    }
    
}
