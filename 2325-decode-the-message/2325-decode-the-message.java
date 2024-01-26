// class Solution 
// {
//     public String decodeMessage(String key, String message) 
//     {
//         Map<Character,Character> hm = new HashMap<>();

//         int keyLen = key.length();
//         // char[] ky = key.toCharArray();
//         char start = 'a';
//         for(int i=0;i<keyLen;i++)
//         {
//             if(key.charAt(i)!=' ')//if white space just continue.
//             if(!hm.containsKey(key.charAt(i)))//if its not present then add it
//             {
//                 hm.put(key.charAt(i),start++);
//             }
//         }
        

//         // char[] msg = message.toCharArray();
//         int messageLen = message.length();
//         StringBuffer sb = new StringBuffer();
//         for(int i=0;i<messageLen;i++)
//         {
//             if(hm.containsKey(message.charAt(i)))
//             sb.append(hm.get(message.charAt(i)));
//             else//for white spaces
//             sb.append(" ");
//         } 
//         return sb.toString();
//     }
// }





class Solution 
{
    public String decodeMessage(String key, String message_str) 
    {
        char[] message = message_str.toCharArray();
        char[] getMapped = createMapping(key);
        for (int i = 0; i < message.length; i++) message[i] = getMapped[message[i]];
        return new String(message);
    }

    private char[] createMapping(String key) 
    {
        char[] res = new char['z' + 1];// array of size 123.
        res[' '] = ' ';//white space character
        boolean[] seen = new boolean['z' + 1];//boolean array of 123.
        seen[' '] = true;//white space character(true bcoz we have seen it in res[])
        int nseen = 0;
        char cur = 'a';//to map(starting from 'a')
        char[] ks = key.toCharArray();
        for (int i = 0; i < ks.length; i++) 
        {
            if (seen[ks[i]]) continue;//means ks[i] was already seen
            seen[ks[i]] = true;//if not seen earlier,but now we have seen so set it to true
            res[ks[i]] = cur++;//mapping the character
            if (++nseen == 26) return res;//nseen=26 that means we have seen 26 unique characters
        }
        return res;
    }
}