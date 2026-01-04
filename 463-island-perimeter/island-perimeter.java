class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    return findperimeter(grid, i, j);
                }
            }
        }
        return 0;
    }

    public int findperimeter(int[][] mat, int r, int c) {

        if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length) {
            return 1;
        }

        if (mat[r][c] == 0) {
            return 1;
        }

        if (mat[r][c] == -1) {
            return 0;
        }

        mat[r][c] = -1;

        int per = 0;
        per += findperimeter(mat, r - 1, c); 
        per += findperimeter(mat, r, c + 1); 
        per += findperimeter(mat, r + 1, c); 
        per += findperimeter(mat, r, c - 1); 

        return per;
    }
}