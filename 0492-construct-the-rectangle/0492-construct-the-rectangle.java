class Solution {
  public int[] constructRectangle(int area) {
    ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(area);i++){
            if(area%i==0){
                list.add(i);
                list.add(area/i);
            }
        }
        if(list.size()==1){
            return new int[] {1,1};
        }
        return new int[] {list.get(list.size()-1), list.get(list.size()-2)};
}
}