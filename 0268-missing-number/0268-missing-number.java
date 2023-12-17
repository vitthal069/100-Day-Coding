class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int totalSum = (len * (len + 1))/2;
        return totalSum - sum;
    }
}