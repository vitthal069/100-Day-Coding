class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
     Set<Integer> set=new HashSet<>();
        int a=-1;
        int tot_sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(set.contains(grid[i][j]))
                {
                    a=grid[i][j];
                }
                tot_sum+=grid[i][j];
                set.add(grid[i][j]);
            }
        }
        System.out.println(tot_sum);
        int n=grid.length;
        n=n*n;
        int sum=(n*(n+1))/2;
        
        int ans[]=new int[2];
        ans[0]=a;
        ans[1]=sum-(Math.abs(tot_sum-a));
        return ans;
  }
}