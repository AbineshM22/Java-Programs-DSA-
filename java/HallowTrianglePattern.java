/**
 * HallowTrianglePattern
 */
public class HallowTrianglePattern {
public static void main(String[] args) {
    int n=6;
    for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
        System.out.print(" ");
        
    }    
        for(int j=0;j<i+1;j++){
            if(i==n-1||j==0){
        System.out.print("#");
            }
    } 
      for(int j=0;j<i;j++){
                    if(i==n-1||j==n-1){

        System.out.print("#");
                    }
    } 
    System.out.println();

    }
}
    
}