class Solution {
    public int numIslands(char[][] grid) {
        
    int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                bsfislands(grid, i, j);
                   count++;
                }
            }

        }

        return count;
    }

    public void bsfislands(char[][] grid, int i, int j){
        grid[i][j] = '0';
        Queue<Pair> q = new LinkedList<>();
        int[][] vector = {{-1,0},{0,1},{1,0},{0,-1}};

        q.add(new Pair(i, j));
        while(!q.isEmpty()){
            Pair res = q.poll();
            int v1 = res.x;
            int v2 = res.y;
            for(int k=0;k<4;k++){
                int l = v1+vector[k][0];
                int r = v2+vector[k][1];

                if(l<0 || l>=grid.length || r<0 || r>=grid[0].length)  continue;

                if(grid[l][r] == '0') continue;

               
                grid[l][r] = '0';
                q.add(new Pair(l, r));

            }
        }
    }
}

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}