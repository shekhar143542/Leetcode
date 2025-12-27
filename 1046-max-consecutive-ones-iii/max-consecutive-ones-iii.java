class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int e=0;e<n;e++){
            if(nums[e] == 0){
                count++;
            }
            while(count > k){
                if(nums[s] == 0){
                    count--;
                }
                s++;
            }
            max = Math.max(max, e-s+1);

        }
        return max;
    }
}