class Solution {
  public List<Integer> grayCode(int n) {
   List<Integer> gc = new ArrayList<>();
        int m = (int)Math.pow(2,n);
        for(int i=0;i<m;i++){
            gc.add((i >> 1) ^ i);
        }
        return gc;
  }
}