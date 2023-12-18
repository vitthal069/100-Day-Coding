class Solution {
    public int helper(int n, int idx) {
        // base condition
        if (n == 0 || idx == 0)
            return 1;
        // recursive call for each step
        if (idx > n)
            return helper(n, idx - 1);
        // return the maximum result obtained from recursive calls
        return Math.max((idx * helper(n - idx, idx)), helper(n, idx - 1));
    }
    public static int tab(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }

        return dp[n];
    }
    public int memo(int n, int idx,int[][] dp) {
        // base condition
        if (n == 0 || idx == 0)
            return 1;
        if(dp[n][idx]!=-1){ 
            return dp[n][idx];
        }
        // recursive call for each step
        if (idx > n)
            return memo(n, idx - 1,dp);
        // return the maximum result obtained from recursive calls
        return dp[n][idx]=Math.max((idx * memo(n - idx, idx,dp)), memo(n, idx - 1,dp));
    }
    public int integerBreak(int n) {
        int[][] dp = new int[n+1][n];
        for(int i=0 ;i<n+1;i++){ 
            Arrays.fill(dp[i],-1);
        }
        return tab(n);
    }
}