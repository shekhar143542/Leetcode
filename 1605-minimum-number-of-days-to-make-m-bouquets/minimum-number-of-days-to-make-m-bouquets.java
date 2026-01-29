class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
         int low = Integer.MAX_VALUE;
         int high = Integer.MIN_VALUE;
         int ans = -1;
         for(int bloom:bloomDay){
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
         }
         while(low<=high){
            int mid = (low+high)/2;
            boolean possible = Possiblefun(bloomDay,mid,m,k);
            if(possible == true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
         }
         return ans;
    }
    private boolean Possiblefun(int[] arr, int day, int m, int k){
        int n = arr.length;
        int count = 0;
        int bouquets = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                count++;
                
            }else{
                bouquets += count/k;
                count = 0;
            }
            
        }
        bouquets += count/k;
        if(bouquets >= m){
            return true;
        }
        return false;
    }
}