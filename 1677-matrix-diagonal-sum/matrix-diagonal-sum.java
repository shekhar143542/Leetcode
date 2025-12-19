class Solution {
    public int diagonalSum(int[][] mat) {
         int n = mat.length;
         int i = 0;
         int j = 0;
         int sum1 = 0;
         int sum2 = 0;
         while(i<n){
            sum1 += mat[i][j];
            i++;
            j++;
         }

         i = 0;
         j = n-1;
         while(j>=0){
            if(i == j){
                i++;
                j--;
                continue;
            }

            sum2 += mat[i][j];
            i++;
            j--;
         }

         return sum1+sum2;
    }
}