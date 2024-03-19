package HackerRank;

import java.util.Scanner;

public class OddEvenSpaceString {

      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.print("enter");
        int n=sc.nextInt();
        sc.nextLine();
        for(int k=0;k<n;k++){
                System.out.print("enter");

        String s=sc.nextLine();
        }
        String even="";
        String odd= "";

        for(int i=0;i<s.length();i++){
            if(i%2==0){
               odd+=s.charAt(i);
            }
            else{
               even+=s.charAt(i);
  
            }
        }
        System.out.print(odd+" "+even);
        
        
}
}