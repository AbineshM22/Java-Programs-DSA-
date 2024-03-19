import java.util.Arrays;
public class leetcodetrial{
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3,3,4,5};
        int k=0;
        int i;
        for(i=2;i<nums.length;i++){
            if(nums[i]!=nums[i-1]||nums[i]!=nums[i-2]){
                nums[k]=nums[i-2];
               
                k++;
                if(i==nums.length-1){
                    nums[k]=nums[i-1];
                    k++;
                     nums[k]=nums[i];
                     k=k+2;

                }
            }
            
        }
        System.out.print(k);
        System.out.print(Arrays.toString(nums));

    }
}