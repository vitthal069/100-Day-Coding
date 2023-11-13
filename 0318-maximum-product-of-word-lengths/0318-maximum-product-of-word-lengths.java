class Solution {
    public int maxProduct(String[] words) {
      int n = words.length;
        int[] masks = new int[n];

        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                int mask = 1 << (c - 'a');
                masks[i] |= mask;
            }
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    maxLen = Math.max(maxLen, words[i].length() * words[j].length());
                }
            }
        }

        return maxLen;  
    }
}