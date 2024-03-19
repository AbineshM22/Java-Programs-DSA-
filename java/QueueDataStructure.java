import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {
    public static void main(String[] args) {
        Queue<Integer> s=new LinkedList<>();
        s.offer(1);
        s.offer(3);
        s.offer(4);
        s.offer(7);
        //Remove and peak are same Just behavior Differnece
        s.remove(1); //throws Exception when no value in Queue
        s.peek(); //throw Null when no value in Queue
        System.out.println(s.size()+" " +s.peek());
       System.out.print(s.poll()+" " +s.peek()+" "+s.contains(1));
    }
}
