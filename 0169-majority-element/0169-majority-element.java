class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>n/2) return e.getKey();
        }
        return -1;
    }
}