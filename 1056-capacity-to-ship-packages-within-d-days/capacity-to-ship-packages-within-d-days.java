class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = weights.length;
        for(int i=0;i<n;i++){
            max = Math.max(max, weights[i]);
            sum+=weights[i];
        }

        int l = max;
        int r = sum;
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(weights,days, mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int d, int capacity){

        int days = 1;
        int cur = 0;

        for(int i=0;i<arr.length;i++){
            if(cur+arr[i]<= capacity){
                cur = cur+arr[i];
            }else{
                days++;
                cur = arr[i];
            }
        }
        if(days<=d) return true;

        return false;
    }

}