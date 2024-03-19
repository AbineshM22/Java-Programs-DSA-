
import java.util.Arrays;
public class MatrixAddition {
    public static void main(String[] args) {
        int a[][]={{1,3,4},
                {3,5,6},
                 {3,4,5}};

        int b[][]={{5,3,4},
                {3,5,7},
                 {3,4,5}};
                 int[][] res=new int[a.length][a[0].length];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<(a[0].length);j++){
          
            res[i][j]=a[i][j]+b[i][j];
        }
    }
    for (int i = 0; i < res.length; i++) {
        for (int j = 0; j < res[i].length; j++) {
            System.out.print(res[i][j] + " ");
        }
        System.out.println();  // Move to the next line for a new row
    }    }
}
