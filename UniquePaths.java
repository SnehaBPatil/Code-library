class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            dp[i][j]=-1;
        }
        return helper(m-1,n-1,dp);
        
    }
    public int helper(int m,int n,int dp[][])
    {
        if(m==0 && n==0)
        return 1;
        if(m==0 || n==0)
        return 1;
        if(m<0 || n<0)
        return 0;
        if(dp[m][n]!=-1)
        return dp[m][n];
        dp[m][n]= helper(m-1,n,dp)+helper(m,n-1,dp);
        return dp[m][n];
    }
}
