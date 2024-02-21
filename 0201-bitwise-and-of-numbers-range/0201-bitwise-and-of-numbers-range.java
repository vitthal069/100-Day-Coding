class Solution {
  public int rangeBitwiseAnd(int m, int n) {
    int SB = 0;

    while (m != n) {
      m >>= 1;
      n >>= 1;
      ++SB;
    }

    return m << SB;
  }
}