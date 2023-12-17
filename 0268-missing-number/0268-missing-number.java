class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int count = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(nums[0]==1) {
                return 0;
            }
            if(nums[i]==count) {
                count++;
            } else {
                return count;
            }
        }
        return n;
    }
}