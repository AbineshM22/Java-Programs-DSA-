public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        int k=6;
        for(int i=0;i<k;i++){
            for(int j=0;j<k-i;j++){
         System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
