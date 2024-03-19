import java.util.Arrays;
public class Insertelementatarrayindex {
    public static void main(String[] args){
        int[] arr={1,4,56,4,3,4};
        int pos=4;
        int val=7;
        int l=arr.length;
        int[] faq=new int[l+1];
        for(int i=0;i<l+1;i++){
            if(i<pos){
                faq[i]=arr[i];

            }
            else if (i==pos) {
                  faq[i]=val;

            }
            else{
               faq[i]=arr[i-1];

            }
        }
        System.out.print(Arrays.toString(faq));

    }
}
