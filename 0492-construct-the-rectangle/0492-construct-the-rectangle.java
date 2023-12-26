class Solution {
  public int[] constructRectangle(int area) {
    int save = Integer.MAX_VALUE;
        int[] lw = new int[2];
        for(int i = 1; i <= area; i++){
            if(area % i == 0){
                int other = area/i;
                if(i - other >= 0 && (i - other < save)){
                    lw[0] = i;
                    lw[1] = other;
                    save = i - other;
                }
            }
        }
        return lw;
}
}