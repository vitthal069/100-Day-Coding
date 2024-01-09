class Solution {
    HashSet<Integer> s = new HashSet<>();
    public boolean check(int n){
       while(n>0){
           if(s.contains(n%10)){
               return false;
           }
           s.add(n%10);
           n = n/10;
       }
       return true;
       }
    public boolean isFascinating(int n) {
       if(check(n)==false){
           return false;
       }
       if(check(2*n)== false){
           return false;
       }
       if(check(3*n)== false){
           return false;
       }
       if(s.contains(0) || s.size()!=9){
           return false;
       }
       return true;
    }
}