class Solution {
    public int maximum69Number (int num) {
      String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '6') {
                int newNum = Integer.parseInt(numStr.substring(0, i) + "9" + numStr.substring(i + 1));
                if (newNum > num) {
                    return newNum;
                }
            }
        }
        return num;  
    }
}