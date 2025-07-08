public class Knapsack {

    // 1️⃣ 0/1 Knapsack - Maximize Profit
    // public static int knapsackTab(int val[], int wt[], int W) {
    //     int n = val.length;
    //     int dp[][] = new int[n + 1][W + 1];

    //     // Initialize first row and column as 0
    //     for (int i = 0; i <= n; i++) {
    //         dp[i][0] = 0;
    //     }
    //     for (int j = 0; j <= W; j++) {
    //         dp[0][j] = 0;
    //     }

    //     // Build the table
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= W; j++) {
    //             int v = val[i - 1]; // value of current item
    //             int w = wt[i - 1];  // weight of current item
    //             if (w <= j) {
    //                 int incProfit = v + dp[i - 1][j - w]; // include
    //                 int excProfit = dp[i - 1][j];         // exclude
    //                 dp[i][j] = Math.max(incProfit, excProfit);
    //             } else {
    //                 dp[i][j] = dp[i - 1][j]; // cannot include
    //             }
    //         }
    //     }

    //     return dp[n][W]; // Maximum profit
    // }

    // public static boolean targetSum(int arr[], int sum) {
    //     int n = arr.length;
    //     boolean[][] dp = new boolean[n + 1][sum + 1];

    //     for (int i = 0; i <= n; i++) {
    //         dp[i][0] = true;
    //     }

    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= sum; j++) {
    //             int v = arr[i - 1];
    //             if (v <= j) {
    //                 dp[i][j] = dp[i - 1][j] || dp[i - 1][j - v]; 
    //             } else {
    //                 dp[i][j] = dp[i - 1][j];
    //             }
    //         }
    //     }

    //     return dp[n][sum]; 
    // }

//     public static int unBoundedKnapsack(int val[], int wt[], int W) {
//     int n = val.length;
//     int[][] dp = new int[n + 1][W + 1];

//     for (int i = 0; i <= n; i++) {
//         dp[i][0] = 0;
//     }
//     for (int j = 0; j <= W; j++) {
//         dp[0][j] = 0;
//     }

//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= W; j++) {
//             if (wt[i - 1] <= j) {
//                 dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
//             } else {
//                 dp[i][j] = dp[i - 1][j]; 
//             }
//         }
//     }

//     return dp[n][W];
// }

    public static int coinChange(int coins[] , int sum){
        int dp[][] = new int[coins.length + 1][sum+1];
        for(int i = 0  ; i<coins.length ; i++){
            dp[i][0] = 1;
        }
        for(int j = 1  ; j<sum+1 ; j++){
            dp[0][j] = 0;
        }

        for(int i = 1 ; i <= coins.length + 1 ; i++){
            for(int j = 1 ; j <= sum + 1 ; j++){
                if(coin[i-1] <= j){
                    dp[i][j] = dp[i-1][j-[sum-1]] + dp[i-1][j];
                }else{
                    dp[i-1][j];
                }
            }
            return dp[coins.length][sum];
        }
    }
     



    public static void main(String args[]) {
        // Test Knapsack
        // int val[] = {15, 14, 10, 45, 30};
        // int wt[] = {2, 5, 1, 3, 4};
        // int W = 7;
        // System.out.println("Maximum Profit (Knapsack): " + unBoundedKnapsack(val, wt, W));

        // Test Subset Sum
        // int[] arr = {4, 2, 7, 1, 3};
        // int sum = 10;
        // System.out.println(targetSum(arr, sum));

        int coins[] = {1,2,3};
        int sum = 4;
        System.out.print(coinChange(coinChange , sum));

    }
}
