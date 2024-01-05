class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber==0)
        return "";
        StringBuilder str=new StringBuilder();
        while(columnNumber-->0)
        {
            //columnNumber--;
            char c=(char)('A'+columnNumber%26);
            columnNumber/=26;
            str.append(c);
        }
        str.reverse();
        return str.toString();
    }
}