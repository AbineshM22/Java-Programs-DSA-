public class FactorialRecrusion {
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int result = fact(5); // Change 5 to the desired number
        System.out.print(result);
    }
}



// -----------------------
// public class FactorialRecrusion {
//     public static  int fact(int n){
//         if (n==1||n==0){
//         return 1;
//         }
//         n=n*fact(n-1);
//         return n;

//     }
//     public static void main(String[] args){
//         int result=fact(56);
// System.out.print(result);
//     }

// }
