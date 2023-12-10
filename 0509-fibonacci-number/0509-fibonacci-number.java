class Solution {
    public int fib(int n) {
       if(n < 2) return n;
      int counter1 = 0;
      int counter2 = 1; 
      for(int i =2; i <= n; i++){
        int temp = counter2; 
        counter2 +=counter1; 
        counter1 = temp; 
      }
      return counter2;
    }
}