class Solution {
    public int sumOfPower(int[] nums) {
        
        int mod = 1000000000 + 7 ;
        
        int n = nums.length ;
        
        Arrays.sort(nums) ;
        
        long[] dp = new long[n] ;
        long[] dpSum  = new long[n] ;
        long sum = 0 ;
        for (int i=n-1; i>=0; i--) {
            
           dp[i] = (  2 *  ( i+1 >=n ? 0 : dp[i+1] )  + (long) nums[i] * nums[i] ) % mod  ;    
            long temp = ( i + 1 >= n ? 0 : dp[i+1] ) +   ( (long) nums[i] * nums[i] ) %  mod ;
            temp = temp * nums[i] % mod ;
            
           sum = ( sum +  temp  ) % mod ;
           //System.out.println(sum + "," + temp) ; 
        }
        return (int) sum ;
        
    }
}