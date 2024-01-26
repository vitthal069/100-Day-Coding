import java.util.ArrayList;
import java.util.List;

class Solution {
    public String decodeMessage(String key, String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Character> result = new ArrayList<>();
        List<Character> uniqueKey = new ArrayList<>();

        for (char c: key.toCharArray()) {
            if(!uniqueKey.contains(c) && c != ' '){
                uniqueKey.add(c);
            }
        }


        for(char c: message.toCharArray()){
            if(c != ' '){
                int index = uniqueKey.indexOf(c);
                result.add(alphabet.charAt(index));
            }
            else{
                result.add(' ');
            }
        }
        String decodedMessage = new String();

        for(char c:result){
            decodedMessage= decodedMessage + c;
        }
        return decodedMessage;
    }
}