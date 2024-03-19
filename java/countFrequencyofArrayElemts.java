public class countFrequencyofArrayElemts {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,2,2,3,6,3,2};
       int[] oc=new int[arr.length];
       for(int i=0;i<arr.length;i++){
               int count=1;

               for(int j=i+1;j<arr.length;j++){
                     if(arr[i]==arr[j]){
                        count++;
                        oc[j]=-1;
                     }
                     if(oc[i]!=-1){
                        oc[i]=count;
                     }
               } 
                
       }

       for(int i=0;i<oc.length;i++){
         if(oc[i]!=-1){
         //To print only Duplicate count change this logic
        //if(oc[i]!=-1&&oc[i]!=1){
            System.out.println(oc[i]+" "+arr[i]);
                        System.out.println(oc[i]+" "+arr[i]);

         }
       }
        
    }
}
