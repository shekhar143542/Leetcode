class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    if(board[i][j] == 'O'){
                        regionbfs(i, j, board);
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void regionbfs(int i, int j, char[][] board){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        board[i][j] = '#';

        while(!q.isEmpty()){
            Pair p = q.poll();
            int x = p.x;
            int y = p.y;
            for(int k=0;k<4;k++){
                int l = x+dir[k][0];
                int m = y+dir[k][1];

                if(l<0 || l>=board.length || m<0 || m>=board[0].length){
                    continue;
                }

                if(board[l][m] == 'O'){
                    board[l][m] = '#';
                    q.add(new Pair(l,m));
                }

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