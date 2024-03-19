import java.util.Arrays;

public class EvenOddInSeperateArray {
    public static void main(String[] args){
        int arr[]={1,3,4,7,3,6,5};
         int o=0;
            int e=0;
        for (int i=0;i<arr.length;i++){
           
            if(arr[i]%2==0){
                o++;
            }
            else{
                e++;
            }
        }
        int odd[]=new int[o];
        int even[]=new int[e];
        int l=0;
        int k=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                odd[l]=arr[j];
                l++;
            }
            else{
                 even[k]=arr[j];
                k++;
            }
        }
        System.out.print(Arrays.toString(odd));
                System.out.print(Arrays.toString(even));

    }
}
