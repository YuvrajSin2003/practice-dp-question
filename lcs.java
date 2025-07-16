public class lcs{

    // recursion approach
    // public static int  lcs(String s , String s2 , int n , int m){
    //     if(n == 0 || m == 0) return 0;

    //     if(s.charAt(n-1) == s2.charAt(m-1)){
    //         return lcs(s , s2 , n-1 , m-1) + 1;

    //     }else{
    //         int ans1 = lcs(s , s2, n , m-1);
    //         int ans2 = lcs(s , s2 , n - 1 , m);
    //         return Math.max(ans1 , ans2);
    //     }

    // }

    // Memoization approach
    
    public static void main(String args[]){
        String s = "abcdge";
        String s2 = "abedg";
        int n  = s.length();
        int m = s2.length();
         System.out.print(lcs(s , s2 , n , m));
    }
}