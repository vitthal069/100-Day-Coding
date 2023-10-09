class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Declare the `uniqueCharacters` variable before using it.
        Set<Character> uniqueCharacters = new HashSet<>();

        // Start and end pointers for the substring.
        int start = 0;
        int end = 0;

        // Maximum length of the substring.
        int maxLength = 0;

        // Iterate over the string.
        while (end < s.length()) {
            // Add the current character to the set if it is not already present.
            if (!uniqueCharacters.contains(s.charAt(end))) {
                uniqueCharacters.add(s.charAt(end));
                end++;

                // Update the maximum length of the substring.
                maxLength = Math.max(maxLength, end - start);
            } else {
                // Remove the current character from the set if it is already present.
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }

        // Return the maximum length of the substring.
        return maxLength;
    }
    
}