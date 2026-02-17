class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        int val = findstairs(n, arr);

        return val;
    }

    public int findstairs(int n, int[] dp){

        if(n == 0) return 1;
        if(n == 1) return 1;

        if(dp[n]!=-1) return dp[n];

        int left = findstairs(n-1, dp);
        int right = findstairs(n-2,dp);

        return dp[n] = left+right;
    }
}