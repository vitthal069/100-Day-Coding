class Solution {
    public int islandPerimeter(int[][] grid) {
       int topi = 0;
        int paasi = 0;

        for (int i = 0; i < grid.length; ++i)
            for (int j = 0; j < grid[0].length; ++j)
                if (grid[i][j] == 1) {
                    ++topi;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1)
                        ++paasi;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1)
                        ++paasi;
                }

        return topi * 4 - paasi * 2;
    }
}