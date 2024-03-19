import java.util.Arrays;

public class StackDSAImplementation {
    public static int[] arr=new int[9];
    public static  int n=0;

    public   void push(int v){
      arr[n]=v;
      n++;
    }
    public   void pop(){
      arr[n-1]=0;
    //  n++;
    }


    public static void main(String[] args) {
        StackDSAImplementation stack=new StackDSAImplementation();
        stack.push(8);
                stack.push(7);
                 stack.push(8);
                stack.push(7);iiiiiiiiiiii
        stack.pop();
        System.out.print(Arrays.toString(arr));

    }
}
