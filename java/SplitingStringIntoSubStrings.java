public class SplitingStringIntoSubStrings {
    public static void main(String[] args) {
        String str="welcom";
        String s = str.toUpperCase();

          int n=s.length()/2;
          System.out.print(s.substring(0,n)+" "+s.substring(n));
    }
    
}
