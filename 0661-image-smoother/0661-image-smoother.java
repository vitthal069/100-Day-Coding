class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        int[][] dirs = new int[][]{ {1, 0}, {0, 1}, {1, 1}, {1, -1}, 
                                    {-1, 0}, {0, -1}, {-1, -1}, {-1, 1}};
        
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                result[i][j] = img[i][j];
                int count = 1;
                for (int[] dir : dirs) {
                    if (i + dir[0] >= 0 && i + dir[0] < img.length 
                    && j + dir[1] >= 0 && j + dir[1] < img[0].length) {
                        count++;
                        result[i][j] += img[i + dir[0]][j + dir[1]];
                    }
                }
                result[i][j] /= count;
            }
        }
        return result;
    }
}