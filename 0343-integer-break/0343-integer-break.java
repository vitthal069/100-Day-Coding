class Solution {

    public int integerBreak(int n) {

        if(n <= 3){
            return n - 1;
        }

        int[] memo = new int[n + 1];
        return dp(n, memo);
    }

    public int dp(int num, int[] memo) {
        if(num <= 3){
            return num;
        }

        if(memo[num] != 0) return memo[num];

        int ans = num;
        for(int i = 2; i < num; i++){
            ans = Math.max(ans, i * dp(num - i, memo));
        }

        memo[num] = ans;
        return ans;
    }
}
    /*
    int maxProduct = 1;
    public int integerBreak(int n) {
        int[] memo = new int[n + 1];
        backtracking(n, 1, 0, 1, memo);
        return maxProduct;
    }

    public int backtracking(int n, int currProduct, int currSum, int index, int[] memo){
        

        if(currSum > n) 
            return -1;

        if(currSum == n) {
            maxProduct = Math.max(currProduct, maxProduct);
            return maxProduct;
        }

        if(memo[index] != 0) 
            return memo[index];
            
        int max = 0;
        for(int i = 1; i < n; i++) {
            currSum += i;
            currProduct *= i;
            max = backtracking(n, currProduct, currSum, i + 1, memo);
            currProduct = currProduct / i;
            currSum -= i;
        }

        memo[index] = Math.max(max, memo[index]);
        return memo[index];
    }
}
*/
/*
bk(5,1,0,1)
    bk(5,1,1,2)
        bk(5,2,3,3)
            bk(5,2,6,6)


n = 5

0 + 5               => 0 * 5 = 0
1 + 4               => 1 * 4 = 4
2 + 3               => 2 * 3 = 10
1 + 1 + 3           => 1 * 1 * 3 = 3
1 + 2 + 2           => 1 * 2 * 2 = 4
1 + 1 + 1 + 2       => 1 * 1 * 1 * 2 = 2
1 + 1 + 1 + 1 + 1   => 1 * 1 * 1 * 1 * 1 = 1
*/