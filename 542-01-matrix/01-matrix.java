class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n = grid.length;
        int m =grid[0].length;
        
        int[][] visited = new int[n][m];
        int[][] dist = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0){
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 1;
                }
            }
        }
        
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            
            Pair p = q.poll();
            int r = p.x;
            int c = p.y;
            int step = p.step;
            
            dist[r][c] = step;

            for(int i=0;i<4;i++){
                int l = r+dir[i][0];
                int a = c+dir[i][1];
                
                if(l<0 || l>=grid.length || a<0 || a>=grid[0].length) continue;
                
                if(visited[l][a] == 0){
                    visited[l][a] = 1;
                    q.add(new Pair(l, a, step+1));
                }
            }
        }
        
        return dist;
    }
}

class Pair{
    int x;
    int y;
    int step;
    Pair(int x, int y, int step){
        this.x = x;
        this.y = y;
        this.step = step;
    }
}