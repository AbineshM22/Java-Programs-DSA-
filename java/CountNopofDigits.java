public class CountNopofDigits {
    public static void main(String[] args){
        int n=125543;
        int Digit=0;
    while(n>0){
        n=n/10;
Digit++;
    }  
    System.out.println(Digit);
    }
}
