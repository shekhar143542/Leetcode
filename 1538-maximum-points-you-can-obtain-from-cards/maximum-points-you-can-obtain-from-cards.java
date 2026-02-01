class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
       int  r = cardPoints.length-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }

        sum = lsum;
        if(r+1 == k){
            return lsum;
        }

        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;
            sum = Math.max(sum, lsum+rsum);
        }

        return sum;
    }
}