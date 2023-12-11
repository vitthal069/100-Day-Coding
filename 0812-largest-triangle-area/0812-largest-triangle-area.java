class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        double max_Area = Integer.MIN_VALUE;
        int x1, y1, x2, y2, x3, y3;
        int n = points.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    x1 = points[i][0];
                    y1 = points[i][1];
                    x2 = points[j][0];
                    y2 = points[j][1];
                    x3 = points[k][0];
                    y3 = points[k][1];
                    area = 0.5 * (Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
                    if (area > max_Area) {
                        max_Area = area;
                    }
                }
            }

        }
        return max_Area;
    }
}