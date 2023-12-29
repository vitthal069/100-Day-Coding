class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] output = new int[2];
        int max = (int) Math.pow(grid[0].length, 2);
        Set<Integer> ints = new HashSet<>();
        int sum=0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!ints.add(grid[i][j])) {
                    output[0] = grid[i][j];
                } else {
                    sum+=grid[i][j];
                }
            }
        }
        output[1] = (max*(max+1)/2)-sum;
        return output;
  }
}