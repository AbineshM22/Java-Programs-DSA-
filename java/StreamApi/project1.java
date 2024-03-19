import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;





public class project1{
    public static void main(String[] args) {
        List<Integer> data=Arrays.asList(1,3,4,6,7);
        // data.stream().filter(n->n%2==0).sorted().map(n->n*2).forEach(n ->System.out.print(n+" "));
      int d= data.stream().filter(n->n%2==0).sorted().map(n->n*2).reduce(0, (c,e)->c+e);
         System.out.print(d);

        // Stream sd=data.stream();
        // Stream sorted=sd.sorted();


        // System.out.print(sorted.count());
        ///parallel Stream is nothing but it works in parallelly

    }
    
}