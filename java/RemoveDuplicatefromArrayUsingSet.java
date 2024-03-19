
import java.util.*;


public class RemoveDuplicatefromArrayUsingSet {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,6,4,2,4,7};
        Set <Integer> s=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }

        
        System.out.print(s);
        



    }
}
