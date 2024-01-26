class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder result = new StringBuilder();

        // Creare la tablla per la decifrazione
        Map<Character, Character> decipherTable = new HashMap<>();
        int alphabetLetter = 97;

        for (int i = 0; i < key.length(); i++) {
            if (!decipherTable.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                decipherTable.put(key.charAt(i), (char) alphabetLetter);
                alphabetLetter++;
            }
        }

        // Decifrare
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                result.append(' ');
            } else {
                result.append(decipherTable.get(message.charAt(i)));
            }
        }

        return result.toString();
    }
}