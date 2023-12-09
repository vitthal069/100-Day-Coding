class Solution {
    public boolean stoneGame(int[] piles) {
      int[] dp = new int[piles.length];
        for(int i = piles.length - 1; i >= 0; i--) {
            for(int j = i; j < piles.length; j++) {
                if(i == j) {
                    dp[i] = piles[i];
                } else {
                    dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j-1]);
                }
            }
        }
        return dp[piles.length-1] >= 0;
    }
}