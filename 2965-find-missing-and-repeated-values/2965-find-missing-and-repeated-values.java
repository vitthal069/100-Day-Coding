class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
     int n = grid.length;
        int[] count = new int[n * n + 1];
        int repeated = 0, missing = 0;

        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
                if (count[num] == 2) {
                    repeated = num;
                }
            }
        }
        
        for (int i = 1; i <= n * n; ++i) {
            if (count[i] == 0) { // Identify the missing value
                missing = i;
                break;
            }
        }
        
        return new int[] { repeated, missing };
  }
}