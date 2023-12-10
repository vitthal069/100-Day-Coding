class Solution {
    public int fib(int n) {
        int a=0,b=1,c=a+b;
        int count=0,k=0;
        if(n==1){
          k=1;
        }else if(n==2){
          k=c;
        }else{

        while(count<=1000){
            if(count==(n-2))
            {
                k=c;
            }
            a=b;
            b=c;
            c=a+b;

            count++;
        }
        }
        return k;
    }
}