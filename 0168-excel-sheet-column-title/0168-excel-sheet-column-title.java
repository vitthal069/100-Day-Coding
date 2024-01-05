class Solution {
    public String convertToTitle(int columnNumber) {
        // columnNumber = 26 * 26;
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            System.out.println("num: " + columnNumber);
            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}