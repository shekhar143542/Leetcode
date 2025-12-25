class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length*matrix[0].length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            int val = matrix[row][col];
            if(val == target){
                return true;
            }else if(target > val){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        return false;
    }
}