class Solution {
  public int[] constructRectangle(int area) {
    int l = 1;
        int r = 1;
        int[] result = new int[2];

        for(int i = 1; i <= area; i++) {
            if (area % i == 0 && (area / i >= i)) {
                    l = area / i;
                    r = i;

            }
        }

        result[0] = l;
        result[1] = r;

        return result;
  }
}