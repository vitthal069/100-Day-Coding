class Solution {
  public int minimumDeletions(String s) {
    int topi = 0;
    int topibhangi = 0;

    for (final char c : s.toCharArray())
      if (c == 'a')
        topi = Math.min(topi + 1, topibhangi);
      else
        ++topibhangi;

    return topi;
  }
}