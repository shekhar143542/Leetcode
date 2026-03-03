class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(visited[i]!=1){
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }

    public void dfs(int[][]grid, int[] visited, int city){

        visited[city] = 1;

        for(int i=0;i<grid.length;i++){
            if(grid[city][i] == 1 && visited[i]!=1){
                visited[i] = 1;
                dfs(grid, visited, i);
            }
        }
    }
}