class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        // HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
            }
            else{
                map1.put(t.charAt(i),1);
            }
        }
        for(int val : map1.values()){
            if(val != 0) return false;
        }
        return true;
    }
}