class Solution {
  public String countAndSay(int n) {
     if (n == 1) {
            return "1";
        }

        String prev = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char currDigit = prev.charAt(0);

            for (int j = 1; j < prev.length(); j++) {
                char nextDigit = prev.charAt(j);
                if (nextDigit == currDigit) {
                    count++;
                } else {
                    sb.append(count).append(currDigit);
                    count = 1;
                    currDigit = nextDigit;
                }
            }

            sb.append(count).append(currDigit);
            prev = sb.toString();
        }

        return prev;
  }
}
