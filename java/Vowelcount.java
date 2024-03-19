public class Vowelcount {
    public static void main(String[] args) {
        
        String s="I m from Chennai";
        s=s.replaceAll("\\s","");
    char[] arr=s.toCharArray();
    int c=0;
    for(int i=0;i<arr.length;i++){
 if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'){
c++;
 }
    }
System.out.print(c);

    }

}
