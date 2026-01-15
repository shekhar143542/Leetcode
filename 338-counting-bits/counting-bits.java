class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int count = 0;
        for(int k=0;k<=n;k++){
            count = 0;
        for(int i=0;i<32;i++){
            if((k&(1<<i)) != 0){
                count++;
            }
        }
        ans[k] = count;
      }
      
      return ans;
    }
}