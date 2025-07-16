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
    public static void main(String args[]){
        int n = 4;
        System.out.print(catlanRec(20));
    }
}