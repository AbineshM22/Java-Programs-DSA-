public class ZeroOneTriamgle {
    public static void main(String[] args) {
        int k=6;
        int o=1;
        for(int i=0;i<k;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
         System.out.print("0");
                }else{
         System.out.print("1");

                }
            }
            System.out.println();
        }
    }
}
