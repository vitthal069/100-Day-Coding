class Solution {
    public static int rob(int[] nums) {
        int system = 0;
        int protocol = 0;

        for (int num : nums) {
            int newSystem = protocol + num;
            protocol = Math.max(system, protocol);
            system = newSystem;
        }

        return Math.max(system, protocol);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int maxStolenAmount = rob(nums);
        System.out.println("Maximum stolen amount: " + maxStolenAmount);
    }
}