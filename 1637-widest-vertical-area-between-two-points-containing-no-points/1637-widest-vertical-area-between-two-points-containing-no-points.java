class Solution {
  public int maxWidthOfVerticalArea(int[][] points) {
    Arrays.sort(points, (x, y) -> x[0] - y[0]);
        int w = 0;
        for (int i = 1; i < points.length; i++) {
            w = Math.max(w, points[i][0] - points[i - 1][0]);
        }
        return w;
  }
}