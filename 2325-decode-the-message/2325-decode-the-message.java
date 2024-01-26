class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        char alphabet = 'a';
        HashMap<Character,Character> ans = new HashMap<>();
        for (int i=0;i<key.length();i++) {
            if (ans.containsKey(key.charAt(i)) == false) {
                ans.put(key.charAt(i),alphabet);
                alphabet++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<message.length();i++) {
            if (ans.containsKey(message.charAt(i))) {
                sb.append(ans.get(message.charAt(i)));
            }
            else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}