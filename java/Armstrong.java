public class Armstrong {
    public static void main(String[] args){
        int n=553;
        int m=n;
        int k=0;
        while(n>0){
            int r=n%10;
          k+=(r*r*r);
        n=n/10;
        }
        System.out.print(m==k);
    }
}
