class Solution {
    public int f(int i,int j,String word1,String word2,int[][] dp){
        // base case
        if(i<0) return j+1;
        if(j<0) return i+1;

        if(dp[i][j]!=0) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=0 + f(i-1,j-1,word1,word2,dp);
        }
        // else 
        int x = 1 + f(i,j-1,word1,word2,dp);  // insert
        int y = 1 + f(i-1,j,word1,word2,dp);  // delete
        int z= 1 + f(i-1,j-1,word1,word2,dp);  // replace

        int mini=Math.min(x,y);
        return dp[i][j]=Math.min(mini,z);
   
    }
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        return f(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
}