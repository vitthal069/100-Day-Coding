class Solution {
    public int sumOfPower(int[] nums) {
        
        Arrays.sort(nums);
        int i;
        long sum = 0,prefix=0,mod=(long)(1e9)+7;
        for(i=0;i<nums.length;i++){
            sum=(sum+((((long)nums[i]*(long)nums[i])%mod)*((prefix+nums[i])%mod))%mod)%mod;
            prefix = ((2*prefix)%mod+nums[i])%mod;
        }
        return (int)(sum);
        
    }
}