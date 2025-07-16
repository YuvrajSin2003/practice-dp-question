import java.util.*;

public class Catalan {
    public static int catlanRec(int n){
        if(n == 0 || n == 1) return 1;

        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans += catlanRec(i) * catlanRec(n-i-1);
        }
        return ans;
    }

    public static int catalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i<= n ; i++){
            for(int j = 0 ; j<i ; j++){
                dp[i] += dp[j] * dp[i-j-1]; // Ci = Cj * Ci-j-1
            }
        }
        return dp[n];
    }

    public static int catalanMemo(int n ,int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            ans += catalanMemo(i , dp) * catalanMemo(n-i-1 , dp);
        }
            return dp[n] = ans;

    }
    public static void main(String args[]){
        int n = 4;

        // System.out.print(catlanRec(20));
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        System.out.print(catalanTab(40));
    }
}