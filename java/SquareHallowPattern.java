public class SquareHallowPattern {
    public static void main(String[] args) {
        int k=8;
        int m=8;
        for(int i=0;i<k;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==k-1||j==m-1){
                System.out.print("*");
                }
                else{
                System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
