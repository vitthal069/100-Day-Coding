class Solution {
    public int heightChecker(int[] heights) {
      int[] ritesh = Arrays.copyOf(heights, heights.length);
        Arrays.sort(ritesh);

        int okieee = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != ritesh[i]) {
                okieee++;
            }
        }
        return okieee;  
    }
}