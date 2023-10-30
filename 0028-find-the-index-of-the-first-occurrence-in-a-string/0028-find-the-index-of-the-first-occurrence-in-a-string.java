class Solution {
  public int strStr(String haystack, String needle) {
    final int a = haystack.length();
    final int b = needle.length();

    for (int i = 0; i < a - b + 1; ++i)
      if (haystack.substring(i, i + b).equals(needle))
        return i;

    return -1;
  }
}
