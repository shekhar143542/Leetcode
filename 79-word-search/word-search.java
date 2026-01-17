class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    if(findworddfs(board, i, j, 0, word)){
                        return true;
                    }
                }
            }

        }
            return false;
    }

    public boolean findworddfs(char[][] mat, int i, int j, int idx, String str){



        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length){
            return false;
        }

        if(mat[i][j] != str.charAt(idx) ){
            return false;
        }


        if(idx == str.length()-1){
            return true;
        }

        char temp = mat[i][j];
        mat[i][j] = '@';


        boolean a = findworddfs(mat, i-1, j, idx+1, str);
        boolean b = findworddfs(mat, i, j+1, idx+1, str);
        boolean c = findworddfs(mat, i+1, j, idx+1, str);
        boolean d = findworddfs(mat, i, j-1, idx+1, str);

    
        mat[i][j] = temp; 
        return a || b || c || d;
    }
}