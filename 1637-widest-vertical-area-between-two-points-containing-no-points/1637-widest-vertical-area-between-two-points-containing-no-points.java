class Solution {
  public int maxWidthOfVerticalArea(int[][] points) {
    int xpoints[] = new int[points.length];
		for(int i=0;i<points.length;i++)
			xpoints[i] = points[i][0];
		Arrays.parallelSort(xpoints);
		int max = 0;
		for (int i = 1; i < points.length; i++)
			if (max < (xpoints[i] - xpoints[i - 1]))
				max = xpoints[i] - xpoints[i - 1];
		return max;
  }
}