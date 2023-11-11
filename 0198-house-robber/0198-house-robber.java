class Solution {
   public static int rob(int[] nums) {
        int include = 0;
        int exclude = 0;

        for (int num : nums) {
            int newInclude = exclude + num;
            exclude = Math.max(include, exclude);
            include = newInclude;
        }

        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int maxStolenAmount = rob(nums);
        System.out.println("Maximum stolen amount: " + maxStolenAmount);
    }
}