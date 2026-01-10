class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int ones = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                ones++;
            }
        }
        for(int i=0;i<ones;i++){
            if(nums[i] == 1){
                count++;
            }
        }
        max = count;
        int start = 0;
        for(int e=ones;e<2*n;e++){
            if(nums[start%n] == 1){
                count--;
            }
            if(nums[e%n] == 1){
                count++;
            }
            start++;
            max = Math.max(max, count);
        }

        int val = ones-max;
        return val;
    }
}