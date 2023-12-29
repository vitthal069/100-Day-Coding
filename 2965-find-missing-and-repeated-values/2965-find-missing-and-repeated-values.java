class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] ans = new int[2];
        int row = grid.length;
        int col = grid[0].length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(map.containsKey(grid[i][j]))
                    map.put(grid[i][j] , map.get(grid[i][j]) + 1);
                else
                    map.put(grid[i][j] , 1);
            }
        }
        
        for (int i = 1; i <= row * col; i++) {
           if (map.containsKey(i)) {
                if (map.get(i) > 1)
               ans[0] = i; // repeated value
          } else {
             ans[1] = i; // missing value
         }
       }
        return ans;
  }
}