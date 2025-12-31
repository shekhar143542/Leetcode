class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j] == 1){
                   boolean isIsland =  bsfislands(grid1, grid2, i, j);
                   if(isIsland){
                    count++;
                   }
                }
            }

        }

        return count;
    }

    public boolean bsfislands(int[][] grid1, int[][]grid2, int i, int j){
        grid2[i][j] = 0;
        Queue<Pair> q = new LinkedList<>();
        int[][] vector = {{-1,0},{0,1},{1,0},{0,-1}};
        boolean val = true;
        if(grid1[i][j] == 0){
            val = false;
        }
        q.add(new Pair(i, j));
        while(!q.isEmpty()){
            Pair res = q.poll();
            int v1 = res.x;
            int v2 = res.y;
            for(int k=0;k<4;k++){
                int l = v1+vector[k][0];
                int r = v2+vector[k][1];

                if(l<0 || l>=grid2.length || r<0 || r>=grid2[0].length)  continue;

                if(grid2[l][r] == 0) continue;

                if(grid1[l][r] == 0){
                    val = false;
                }
                grid2[l][r] = 0;
                q.add(new Pair(l, r));

            }
        }
        return val;
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