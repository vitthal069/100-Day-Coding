class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int res = sum - Arrays.stream(nums).sum();
        return res;
    }
}