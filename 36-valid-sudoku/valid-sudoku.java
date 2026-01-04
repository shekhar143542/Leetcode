class Solution {
    public boolean isValidSudoku(char[][] mat) {
           boolean valid = true;
           int n = mat.length;
           HashSet<Character>[] col = new HashSet[n];
            HashSet<String> box = new HashSet<>();
            for(int k=0;k<n;k++){
                col[k] = new HashSet<>();
            }
            for(int i=0;i<n;i++){
            HashSet<Character> row = new HashSet<>();
                for(int j=0;j<n;j++){
                    if(mat[i][j] == '.'){
                        continue;
                    }
                char val = mat[i][j];
                int r = i/3;
                int c = j/3;
                String str = val+" "+r+c;
                    if(row.contains(val) || col[j].contains(val) || box.contains(str)){
                        valid = false;
                        break;
                    }
                    else{
                        row.add(mat[i][j]);
                        col[j].add(mat[i][j]);
                        box.add(str);
                    }
                }
            }
        return valid;
    }
}