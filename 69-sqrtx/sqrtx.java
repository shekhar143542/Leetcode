class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;

        if(x == 1){
            return 1;
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid == 0){
                return 0;
            }
            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return r;
    }
}