import java.util.*;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(3);
         s.push(4);
        s.push(7);

        System.out.println(s.size()+" " +s.peek());
       System.out.print(s.pop()+" " +s.peek());

    }
}
