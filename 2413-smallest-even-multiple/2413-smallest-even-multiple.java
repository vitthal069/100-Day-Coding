class Solution {
    public int smallestEvenMultiple(int n) {
      int oodde = n % 2 + 1;
        return n * oodde;
    }
}