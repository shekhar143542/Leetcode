class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    int val = findArea(grid, i, j);
                    max = Math.max(max, val);
                }
            }
        }
        return max;
    }

     public int findArea(int[][] mat, int r, int c){
        if(r>=mat.length || r<0 || c>=mat[0].length || c<0){
            return 0;
        }

        if(mat[r][c] == 0){
            return 0;
        }
        mat[r][c] = 0;

        int a = findArea(mat, r-1, c);
        int b = findArea(mat, r, c+1);
        int e = findArea(mat, r+1, c);
        int d = findArea(mat, r, c-1);

        return 1+a+b+e+d;
    }

}