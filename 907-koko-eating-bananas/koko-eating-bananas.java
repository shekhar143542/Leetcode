class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = findMax(piles, n);
        int ans = 0;

        while(low <= high){
            int mid = (low+high)/2;
            long EatingTime = findtotalTime(piles, mid, n);
            if(EatingTime <= h){
                ans = mid;
                high = mid-1;            
            }else{
                 low = mid+1;
            }
        }
        return ans;
    }
    public int findMax(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public long findtotalTime(int[] arr, int hourly, int n){
        long totalSum = 0;
        for(int i=0;i<n;i++){
           totalSum += (int) Math.ceil((double) arr[i] / hourly);
        }
        return totalSum;
    }
    
}